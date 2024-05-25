
interface B{
    void show(int i);

}

public class lambda_expr2 {
    public static void main(String[] args) {
        //lambda expression
        B obj1 = (i) -> System.out.println("lambda show "+ i);
        obj1.show(5);

    }
}
