package abs.test.program;

public class Example implements MyInterface{
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public void newMethod3(){
        System.out.println("testing new three method");
        
    }
    public static void main(String[] args) {  
        Example obj = new Example();
        
        //calling the default method of interface
        obj.newMethod();     
        obj.newMethod1();     
        obj.newMethod2(); 
        obj.newMethod3();
        //calling the abstract method of interface
        obj.existingMethod("Java 8 is easy to learn"); 
        MyInterface.anotherNewMethod();
  
    }  
}
