import java.util.*;
public class fun5 {
    public static void check(int n){
        if(n%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        check(n);
    }
}
