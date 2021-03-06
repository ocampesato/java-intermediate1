import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamsMapFilter1
{
   public static void main(String[] args)
   { 
     Stream.of("d2", "a2", "b1", "b3", "c")
           .map(s -> {
               System.out.println("map: " + s);
               return s.toUpperCase();
           })
           .filter(s -> {
               System.out.println("filter: " + s);
               return s.startsWith("A");
           })
           .forEach(s -> System.out.println("forEach: " + s));
   } 
} 

