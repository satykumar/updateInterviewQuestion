package ageda.of.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResourseTest1 {

    public static void main(String[] args) throws IOException {
        try (InputStream inputStream = new FileInputStream("c:/txtFile.txt")) {
            //code...
        }
 
}
}
