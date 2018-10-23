package abs.test.program;

public class ExampleInterfaceTest implements MyInterface1, MyInterface2{ 
   //Duplicate default methods named newMethod with the parameters () and () are inherited from the types MyInterface2 and MyInterface
    // implementing abstract methods
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public void disp(String str){
        System.out.println("String is: "+str); 
    }
    
   
    @Override
    public void newMethod() {
        // TODO Auto-generated method stub
        MyInterface1.super.newMethod();
    }
    public static void main(String[] args) {  
        ExampleInterfaceTest obj = new ExampleInterfaceTest();
      //  obj.newMethod3();
        
        //calling the default method of interface
       obj.newMethod();     
    }
}