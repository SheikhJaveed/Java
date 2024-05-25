
interface C{
    void add(int i,int j);

}

public class lambda_expr3 {
    public static void main(String[] args) {
        //lambda expression
        C obj1 = (i,j) -> System.out.println("lambda show "+ i+j);
        obj1.add(5,4);

    }
}
