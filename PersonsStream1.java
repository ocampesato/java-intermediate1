import rx.Observable;
import rx.functions.Func1;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors; 

public class PersonsStream1
{
   public static void main(String[] args)
   { 
      List<Person> persons =
          Arrays.asList(
              new Person("Maxwell", 18),
              new Person("Peter",   23),
              new Person("Pamela",  23),
              new Person("David",   12));

      List<Person> filtered =
          persons.stream()
                 .filter(p -> p.name.startsWith("P"))
                 .collect(Collectors.toList());

      System.out.println("Filtered list:");
      System.out.println(filtered);    // [Peter, Pamela]

      System.out.println("Map Filtered list:");
      Map<Integer, List<Person>> personsByAge = 
                   persons.stream()
                          .collect(Collectors.groupingBy(p -> p.age));

     personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));
   }
}

