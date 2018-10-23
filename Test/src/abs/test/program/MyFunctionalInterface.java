package abs.test.program;

@FunctionalInterface
public interface MyFunctionalInterface {
    public int addMethod(int a, int b);
    
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
}
