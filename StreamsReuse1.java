import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamsReuse1 
{
   public static void main(String[] args)
   { 
      Stream<String> stream1 =
          Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> s.startsWith("a"));

      stream1.anyMatch(s -> true);    // ok
      stream1.noneMatch(s -> true);   // exception

      Supplier<Stream<String>> streamSupplier =
          () -> Stream.of("d2", "a2", "b1", "b3", "c")
                      .filter(s -> s.startsWith("a"));

      streamSupplier.get().anyMatch(s -> true);   // ok
      streamSupplier.get().noneMatch(s -> true);  // ok
   } 
} 

