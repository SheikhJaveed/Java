
import java.util.Arrays;
//Reference to an instance method of an arbitrary object of a particular type
public class  ref_to_instanceMethod_arbitaryObject{
    public static void main(String[] args) {
        // Using lambda expression
        Arrays.asList("apple", "orange", "banana").forEach(s -> System.out.println(s.toUpperCase()));

        // Using method reference
        Arrays.asList("apple", "orange", "banana").forEach(String::toUpperCase);
    }
}
