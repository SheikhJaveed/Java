import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();  //if it was sc.next() only one word would be printed
        System.out.println("Your name is "+name);
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName+"@"+lastName;
        System.out.println(fullName);
        System.out.println(fullName.length());
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));  //returns characters one by one 
        }
    }
}
