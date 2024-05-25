import java.util.*;
public class fun9 {
    public static void sumofnumbers(int a, int b){
        int sum=a+b;
        System.out.println("Sum is "+sum);
    }
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sumofnumbers(a, b);
    }
}
