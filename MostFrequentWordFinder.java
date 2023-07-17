package il.co.lird.FS133.Projects.varonis;

import il.co.lird.FS133.Projects.varonis.interfaces.IMostFrequentWordFinder;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MostFrequentWordFinder implements IMostFrequentWordFinder {

    @Override
    public String findMostFrequentWord(List<String> words) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        int maxCount = 0;
        String mostFrequentWord = "";

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            int count = wordCountMap.get(word);
            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = word;
            }
        }

        return mostFrequentWord;
    }

    @Override
    public int getWordCount(List<String> words, String word) {
        return Collections.frequency(words, word);
    }
}