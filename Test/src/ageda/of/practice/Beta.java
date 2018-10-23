package ageda.of.practice;

import java.io.IOException;

public class Beta extends Parent{

    public void m() throws IOException{
        System.out.println("shweta");
    }
    
    public static void main(String[] args) throws IOException {
        Beta b=     new Beta();
        b.m();
        
    }
}
