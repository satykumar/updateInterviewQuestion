package abs.test.program;

public interface MyInterface2 {

    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    void disp(String str); 
}
