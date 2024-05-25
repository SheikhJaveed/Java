import java.util.*;
public class func13 {
    public static void power(int x, int n){
        int result=1;
        for(int i=0;i<n;i++){
            result=result*x;
        }
        System.out.println("The exponent is "+result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base:");
        int x=sc.nextInt();
        System.out.println("Enter the power:");
        int n=sc.nextInt();
        power(x,n);
    }
}
