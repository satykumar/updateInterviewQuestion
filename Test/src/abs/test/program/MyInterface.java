package abs.test.program;

public interface MyInterface {

    default void newMethod(){  
        System.out.println("Newly added default method");  
    }  
    
    default void newMethod1(){  
        System.out.println("Newly added default method1");  
    }  
    default void newMethod2(){  
        System.out.println("Newly added default method2");  
    }  
    default void newMethod3(){  
        System.out.println("Newly added default method3");  
    }  
    static void anotherNewMethod(){
        System.out.println("Newly added static method");
    }
    void existingMethod(String str);  
}
