public class check_age {
    public static void main(String[] args) {
        int age=10;
        try{
            if(age>18){
                System.out.println("Eligible to vote");
            }
            else{
                throw new Exception("Not eligible to vote");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
