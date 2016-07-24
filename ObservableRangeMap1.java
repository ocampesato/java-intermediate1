import rx.Observable;

public class ObservableRangeMap1 
{
   public static void main(String[] args)
   { 
      Observable.range(0, 5)
                .map(x -> x*x)
                .subscribe(
                    s   -> System.out.println(s),
                    err -> err.printStackTrace(),
                    ()  -> System.out.println("done"));
   } 
} 

