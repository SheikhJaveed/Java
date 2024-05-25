
import java.util.function.Supplier;
/*Java provides a new feature called method reference in Java 8. Method reference is used to 
refer method of functional interface. It is compact and easy form of lambda expression.
Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference.*/
class MyObject {
    MyObject() {
        System.out.println("Object created");
    }
}

public class ref_to_constructor {
    public static void main(String[] args) {
        // Using lambda expression
        Supplier<MyObject> supplier = () -> new MyObject();
        supplier.get();

        // Using method reference
        Supplier<MyObject> supplierRef = MyObject::new;
        supplierRef.get();
    }
}
