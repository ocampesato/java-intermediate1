import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Streams2 
{
   public static void main(String[] args)
   { 
      // output: a1 
      Stream.of("a1", "a2", "a3")
            .findFirst()
            .ifPresent(System.out::println); 

      // output: 1 2 3 4 (on separate lines) 
      IntStream.range(1, 4)
               .forEach(System.out::println);

      // output: 7.5
      Arrays.stream(new int[] {1, 2, 3, 4})
            .map(n -> 3*n)
            .average()
            .ifPresent(System.out::println); 

/*
      // output: 30
      Arrays.stream(new int[] {1, 2, 3, 4})
            .map(n -> 3*n)
            .sum()
            .ifPresent(System.out::println); 
*/

      Stream.of("a1", "a2", "a3")
            .map(s -> s.substring(1))
            .mapToInt(Integer::parseInt)
            .max()
            .ifPresent(System.out::println);  // 3

      // output: Z1 Z2 Z3 Z4 Z5 (on separate lines) 
      IntStream.range(1, 5)
               .mapToObj(i -> "Z" + i)
               .forEach(System.out::println);

      // output: X1 X2 X3 X4 (on separate lines) 
      Stream.of(1.0, 2.0, 3.0, 4.0)
            .mapToInt(Double::intValue)
            .mapToObj(i -> "X" + i)
            .forEach(System.out::println);
   } 
} 

