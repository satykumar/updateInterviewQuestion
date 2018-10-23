package abs.jav8.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptinolaClass {
public static void main(String[] args) {
    
    Optional<Integer> possible = Optional.of(5);
    possible.ifPresent(System.out::println);

List<String> listOfStrings = Arrays.asList("Mark", "Howard", "Anthony D'Cornian");
Optional<String> largeString 
  = listOfStrings.stream().filter(str -> str.length() > 10).findAny();
largeString.ifPresent(System.out::println);

Optional<String> veryLargeString 
  = listOfStrings.stream().filter(str -> str.length() > 20).findAny();
veryLargeString.ifPresent(System.out::println);

}
}
