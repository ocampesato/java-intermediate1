import rx.Observable;
import rx.functions.Func1;
import java.util.Arrays;
import java.util.List;

public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}

