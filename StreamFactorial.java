import java.util.stream.*;

public class StreamFactorial
{
   public StreamFactorial(){} 

   public long factorial(int n) {
       if (n > 20) throw new IllegalArgumentException(n + " is out of range");
       return LongStream.rangeClosed(2, n).reduce(1, (a, b) -> a * b);
   }

   public static void main(String[] args)
   { 
      StreamFactorial sf = new StreamFactorial();

      System.out.println("5!  = "+sf.factorial(5)); 
      System.out.println("6!  = "+sf.factorial(6)); 
      System.out.println("7!  = "+sf.factorial(7)); 
      System.out.println("8!  = "+sf.factorial(8)); 
      System.out.println("9!  = "+sf.factorial(9)); 
      System.out.println("10! = "+sf.factorial(10)); 
   } 
} 
    
