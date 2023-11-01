package files;

import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;

public class CreateFile {

    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");
        if(file.createNewFile()) {
            System.out.println("Stworzylem nowy plik");
        } else {
            System.out.println("Plik juz istnieje");
        }
    }
}
