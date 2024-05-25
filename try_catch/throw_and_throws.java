
class NegativeValueException extends Exception{
    public String toString(){
        return "Value for area cannot be negative";
    }
}
//throw - to explicitly throw an error
//throws - method may throw an error

public class throw_and_throws {
    public static double area(int r) throws NegativeValueException{
        if(r<0){
            throw new NegativeValueException();
        }
        double result = r*r;
        return result;
    }
    
    public static void main(String[] args) {
        try{
            double a = area(-1);
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
