import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import java.util.ArrayList;

public class InsertNewLine 
{
   public static void main(String[] args)
   { 
      String str = "This is a sentence";
      List<String> myList = appendNewLine(str);

      System.out.println("initial: "+str);
      System.out.println("result:  "+myList);
   } 

   private static List<String> appendNewLine(final String text) 
   {
      String NEW_LINE  = "\n";
      String SEPARATOR = " ";

      return Observable.from(text.split(SEPARATOR))
                       .map(line -> line.trim() + NEW_LINE)
                       .toList()
                       .toBlocking()
                       .single();
   }
} 

