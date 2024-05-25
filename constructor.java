class MyClass {
    int num;
    String name;
}
/*If no constructor is explicitly defined in a class, Java provides a default constructor. This default constructor is parameterless and initializes member variables with default values (0 for numeric types, null for object references, false for boolean). */
public class constructor {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Object created using default constructor
        System.out.println("num: " + obj.num); // Output: num: 0
        System.out.println("name: " + obj.name); // Output: name: null
    }
}
