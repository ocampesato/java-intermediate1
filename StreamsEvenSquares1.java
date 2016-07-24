import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamsEvenSquares1 
{
   public static void main(String[] args)
   { 
      List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8);

      // compute squares of even numbers: 
      List<Integer> twoEvenSquares = 
         nums.stream()
             .filter(n -> {
                  System.out.println("filtering " + n); 
                  return n % 2 == 0;
             })
             .map(n -> {
                  System.out.println("mapping " + n);
                  return n * n;
             })
             .limit(2)
             .collect(Collectors.toList());

      // find list of odd numbers: 
      System.out.println("Odd numbers:");
      List<Integer> oddNumbers = 
                        nums.stream()
                            .filter(n -> n % 2 == 1)
                            .map(n -> {
                               System.out.println("Odd num: " + n);
                               return n; 
                            })
                            .limit(2)
                            .collect(Collectors.toList());
   } 
} 

