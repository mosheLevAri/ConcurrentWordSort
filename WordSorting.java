package il.co.lird.FS133.Projects.varonis;

import il.co.lird.FS133.Projects.varonis.interfaces.IWordSorting;

import java.util.Collections;
import java.util.List;

class WordSorting implements IWordSorting {

    @Override
    public void sortWords(List<String> words, boolean ascending) {
        if (ascending) {
            words.sort(String::compareTo);
        } else {
            words.sort(Collections.reverseOrder());
        }
    }
}