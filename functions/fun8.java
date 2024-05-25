import java.util.*;
public class fun8 {
    public static void odd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("Sum of odd numbers is "+sum);
    }
    //sum of odd numbers till n
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        odd(n);
    }
}
