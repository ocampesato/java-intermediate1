import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate1
{
   public static void main(String args[])
   {
    //Predicate<String> i  = (s)-> s.length() > 5;
    //Predicate<Integer> evenNum  = num -> num % 2 == 0;
      Predicate<Integer> positive = num -> num > 0;

      List integerList = Arrays.asList(new Integer(1), new Integer(10), 
                                       new Integer(200), new Integer(101), 
                                       new Integer(-10), new Integer(0));
  
      List filteredList = filterList(integerList, positive);
      filteredList.forEach(System.out::println);
   }

   public static List filterList(List listOfIntegers, Predicate predicate)
   {
      List filteredList = new ArrayList();

    //forEach(Integer integer:listOfIntegers){
    //for(Integer integer:listOfIntegers){
      for(Object integer:listOfIntegers){
         if(predicate.test((Integer)integer)){
            filteredList.add(integer);
         }
      }

      return filteredList;
   }
}

