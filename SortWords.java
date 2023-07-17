package il.co.lird.FS133.Projects.varonis;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SortWords  {

    private String output_file = "/home/moshe/Temp/F4.txt";

    public void run(String[] filePaths, boolean ascendingSort, String splitOption) {
        ExecutorService executorService = Executors.newFixedThreadPool(filePaths.length);
        List<Future<List<String>>> futures = new ArrayList<>();

        FileOperations fileOperations = new FileOperations(output_file);
        WordSorting wordSorting = new WordSorting();
        MostFrequentWordFinder frequentWordFinder = new MostFrequentWordFinder();

        for (String filePath : filePaths) {
            Future<List<String>> future = executorService.submit(() -> fileOperations.readFile(filePath, splitOption));
            futures.add(future);
        }

        List<String> words = new ArrayList<>();
        for (Future<List<String>> future : futures) {
            try {
                words.addAll(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();

        ExecutorService sortExecutor = Executors.newSingleThreadExecutor();

        sortExecutor.submit(() -> {
            wordSorting.sortWords(words, ascendingSort);
            fileOperations.writeFile(words);
            sortExecutor.shutdown();
        });


        String mostFrequentWord = frequentWordFinder.findMostFrequentWord(words);
        int wordCount = frequentWordFinder.getWordCount(words, mostFrequentWord);

        System.out.println("The most frequent word in all files is '" + mostFrequentWord + "', count: " + wordCount);
    }
}




