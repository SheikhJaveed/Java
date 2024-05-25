

import java.util.Arrays;

public class ref_to_staticMethod {
    public static void main(String[] args) {
        // Using lambda expression
        Arrays.asList("apple", "orange", "banana").forEach(s -> System.out.println(s));

        // Using method reference
        Arrays.asList("apple", "orange", "banana").forEach(System.out::println);
    }
}
