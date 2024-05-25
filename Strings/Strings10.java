import java.util.*;
public class Strings10 {
    public static void main(String[] args) {
        //takes email id as input and returns username 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email id:");
        String email = sc.nextLine();
        String Username = "";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break; 
            }else{
                Username+=email.charAt(i);
            }
        }
        System.out.println("The username is "+Username);
    }
}
