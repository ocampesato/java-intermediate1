import rx.Observable;
import rx.functions.Func1;
import java.util.List;

public class BasicObservable1 
{
   public static void main(String[] args)
   { 
      Observable<String> items = 
              Observable.just("Sentence #1", 
                              "Sentence #2", 
                              "Sentence #3");

      items.subscribe(
         item -> System.out.println("item: "+item));
   } 
} 

