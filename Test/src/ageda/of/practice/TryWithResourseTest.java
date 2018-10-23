package ageda.of.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResourseTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = null;
        try{
               inputStream = new FileInputStream("D:\\DD\\tt.txt");
               //code......
        }finally{
               if(inputStream!=null)
               inputStream.close();
        }
 }
}
