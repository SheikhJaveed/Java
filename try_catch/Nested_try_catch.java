public class Nested_try_catch {
    public static void main(String[] args) {
        try{
            try{
                int a=35/0;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            try{
                int a[]=new int[5];
                a[5]=4;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println("outer catch");
        }
    
    }
}
