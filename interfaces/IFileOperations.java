package il.co.lird.FS133.Projects.varonis.interfaces;

import java.util.List;

public interface IFileOperations {
    List<String> readFile(String filePath, String splitOption);
    void writeFile(List<String> words);
}