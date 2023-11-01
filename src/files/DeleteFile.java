package files;

import java.io.File;
import java.sql.SQLOutput;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.delete()) {
            System.out.println("usunelismy plik");
        } else {
            System.out.println("nie udalo sie usunac");
        }
    }
}
