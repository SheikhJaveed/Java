public class multi_catch {
    public static void main(String[] args) {
        try{
            int a=args.length;
            System.out.println("a="+a);
            int b=42/a;
            int c[]={1};
            c[42]=99;
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bounds"+e);
        }
        catch(Exception e){
            System.out.println("Exception should be last");
        }
    }
}
