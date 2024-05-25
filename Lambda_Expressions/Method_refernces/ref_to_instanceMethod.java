
import java.util.Arrays;

//Reference to an instance method of a particular object
class MyClass {
    void print(String s) {
        System.out.println(s);
    }
}

public class ref_to_instanceMethod {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // Using lambda expression
        Arrays.asList("apple", "orange", "banana").forEach(s -> myObject.print(s));

        // Using method reference
        Arrays.asList("apple", "orange", "banana").forEach(myObject::print);
    }
}
