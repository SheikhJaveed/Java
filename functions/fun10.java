import java.util.*;
public class fun10 {
    public static void vote(int n){
        if(n>=18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the age:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        vote(n);
    }
}
