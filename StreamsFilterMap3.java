import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamsFilterMap3
{
   public static void main(String[] args)
   { 
      // output: nothing 
      Stream.of("d2", "a2", "b1", "b3", "c")
            .filter(s -> {
                System.out.println("filter1: " + s);
                return true;
            });

      // output: (on separate lines) 
      Stream.of("d2", "a2", "b1", "b3", "c")
            .filter(s -> {
                System.out.println("filter2: " + s);
                return true;
            })
            .forEach(s -> System.out.println("forEach: " + s));

      // output: (on separate lines) 
      Stream.of("d2", "a2", "b1", "b3", "c")
            .map(s -> {
                System.out.println("map: " + s);
                return s.toUpperCase()+s;
              //return s.toUpperCase();
            })
            .anyMatch(s -> {
                System.out.println("anyMatch: " + s);
                return s.startsWith("A");
            });
   } 
} 

