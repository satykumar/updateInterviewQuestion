package abs.jav8.test;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Test1 {
public static void main(String[] args) {
    //sum of 1 to 5 number
    int sum = IntStream.of(1, 2, 3, 4, 5).sum();  //n.e. 1 + 2 + 3 + 4 + 5
    System.out.println(sum);
    
    //In Java 8 - Find all even numbers between 1 to 5
    //Use streams
    System.out.println("--");
    IntStream.of(1, 2, 3, 4, 5)  //Numbers between 1 to 5
     .filter(n -> n % 2 == 1) //Filter - all even numbers
     .forEach(System.out::println);
    
  //In Java 8 - Find all numbers greater than 2
    //Use streams
       IntStream.of(1, 2, 3, 4, 5)  //Numbers between 1 to 5
    .filter(n -> n > 2) //Find all numbers greater than 2
     .forEach(System.out::println); //display
       
     //In Java 8 - Find sum of all even numbers between 1 to 5
       int sum1 = IntStream.of(1, 2, 3, 4, 5)
                 .filter(n -> n % 2 == 0).sum(); 
       System.out.println(sum1);//n.e.  2 + 4
       
       OptionalInt max = IntStream.of(9, 5, 3, 12, 4).max();
       System.out.println("max = "+max.getAsInt());
       
     //In Java 8 - Find minimum of all numbers in IntStream
       OptionalInt min = IntStream.of(9, 5, 3, 12, 4).min();
       System.out.println("min = "+min.getAsInt());
       
       //In Java 8 - count number of elements in IntStream
       long count = IntStream.of(9, 5, 3, 12, 4).count();
       System.out.println("count = "+count);
       
       //In Java 8 - Find average of all between 1 to 5
       //Use streams
       OptionalDouble average = IntStream.of(1, 2, 3).average();  //n.e. 1 + 2 + 3 + 4 + 5
       System.out.println("average = "+average.getAsDouble());
      int sumeven= IntStream.range(1, 100).filter(n->n % 2 ==0).sum();
      System.out.println(" sum of evan number " +sumeven);
      
      // concat two IntStream
      IntStream.concat(IntStream.range(1, 50), IntStream.range(60, 120)).filter(n-> n % 3==0).forEach(System.out::println);
       
}
}
