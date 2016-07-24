import rx.Observable;

public class ObservableRangeMap2 
{
   public static void main(String[] args)
   { 
     Observable ob = 
      Observable.range(0, 5)
                .map(x -> x*x);

      ob.subscribe(s   -> System.out.println(s),
                   err -> err.printStackTrace(),
                   ()  -> System.out.println("done"));
   } 
} 

