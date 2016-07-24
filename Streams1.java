import java.util.Arrays;
import java.util.List;

public class Streams1 
{
   public static void main(String[] args)
   { 
      List<String> myList =
          Arrays.asList("a1", "a2", "b2", "b1", "b3");

      // output: B1 B2 B3 (on separate lines) 
      myList
        .stream()
        .filter(s -> s.startsWith("b"))
        .map(String::toUpperCase)
        .sorted()
        .forEach(System.out::println);

      // output: a1 
      Arrays.asList("a1", "a2", "a3")
            .stream()
            .findFirst()
            .ifPresent(System.out::println);
   } 
} 
    
