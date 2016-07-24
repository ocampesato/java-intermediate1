import rx.Observable;
import rx.functions.Func1;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors; 
import java.util.IntSummaryStatistics;

public class PersonsStream2
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

      Double averageAge = persons.stream()
                                 .collect(Collectors.averagingInt(p -> p.age));
                             
      System.out.println(averageAge);     // 19.0

      IntSummaryStatistics ageSummary = persons
                                         .stream()
                                         .collect(Collectors.summarizingInt(p->p.age));

      System.out.println(ageSummary);
    //IntSummaryStatistics{count=4, sum=76, min=12, average=19.000000, max=23}
   }
}

