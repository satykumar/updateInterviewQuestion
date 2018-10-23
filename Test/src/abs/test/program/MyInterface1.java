package abs.test.program;

public interface MyInterface1 {
    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    void existingMethod(String str);  
}
