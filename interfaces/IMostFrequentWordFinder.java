package il.co.lird.FS133.Projects.varonis.interfaces;

import java.util.List;

public interface IMostFrequentWordFinder {
    String findMostFrequentWord(List<String> words);
    int getWordCount(List<String> words, String word);
}