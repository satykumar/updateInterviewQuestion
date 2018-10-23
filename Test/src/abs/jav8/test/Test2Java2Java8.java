package abs.jav8.test;

import java.util.stream.IntStream;

public class Test2Java2Java8 {

    public static void main(String[] args) {
        
        //Before Java 8 - Find all numbers between 1 to 5
        for (int n = 1; n <= 5; n++) {
         if (n % 2 == 0) { //Filter - all even numbers
             System.out.println(n);
         }
        }
 
           IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
           //Or
           IntStream intStream2 = IntStream.of(new int[]{1, 2, 3, 4, 5});
           //Or, All are equivalent
        IntStream intStream3 = IntStream.range(1, 6);
       
      
     //   intStream.forEach(System.out::println); //display
        System.out.println("arry.........");
      //  intStream2.forEach(System.out::println);
        System.out.println("renage.........");
        intStream3.forEach(System.out::println);
      //  System.out.println(intStream3);
 
       int sum= intStream2.filter(n-> n%2==0).sum();
       System.out.println(sum);
    }
}
