package il.co.lird.FS133.Projects.varonis;

import il.co.lird.FS133.Projects.varonis.interfaces.IFileOperations;

import java.io.*;
import java.util.*;

class FileOperations implements IFileOperations {
    private static String FINAL_FILE = null;

    public FileOperations(String output_file)
    {
        FINAL_FILE = output_file;
    }

    @Override
    public List<String> readFile(String filePath, String splitOption) {
        List<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = splitLine(line, splitOption);
                words.addAll(Arrays.asList(tokens));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }


    private String[] splitLine(String line, String splitOption) {
        switch (splitOption) {
            case "split-s":
                return line.split("\\s+");
            case "split-c":
                return line.split(",");
            case "split-n":
                return line.split("\\n");
            default:
                return line.split("\\s+");
        }
    }

    @Override
    public void writeFile(List<String> words) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FINAL_FILE))) {
            Set<String> uniqueWords = new TreeSet<>(words);
            for (String word : uniqueWords) {
                writer.write(word);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
