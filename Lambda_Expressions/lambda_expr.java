
interface A{
    void show();

}

public class lambda_expr {
    public static void main(String[] args) {
        //normal method
//        A obj = new A(){
//            public void show(){
//                System.out.println("show");
//            }
//
//        };
//        obj.show();
        //lambda expression
        A obj1 = () -> System.out.println("lambda show");
        obj1.show();

    }
}
