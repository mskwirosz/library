package pl.javastart.library.file;

import pl.javastart.library.model.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}
