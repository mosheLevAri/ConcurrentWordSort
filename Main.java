package il.co.lird.FS133.Projects.varonis;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        String[] filePaths = Arrays.copyOfRange(args, 0, 3);

        String sortOption = args[args.length - 2];
        boolean ascendingSort = sortOption.equals("sort-a");

        String splitOption = args[args.length - 1];


        SortWords sortWords = new SortWords();
        sortWords.run(filePaths, ascendingSort, splitOption);
    }
}
