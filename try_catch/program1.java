
public class program1 {
    public static void main(String[] args) {
        try{
            int d=0;
            int a=45/d;
        }
        catch(Exception e){
            System.out.println("Division by zero");
        }
        finally{
            System.out.println("End of program");
        }
    }
}
