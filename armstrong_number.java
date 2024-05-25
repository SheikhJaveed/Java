import java.util.Scanner;
import java.lang.Math;
public class armstrong_number {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n,originalNum;
        n=sc.nextInt();
        originalNum=n;        
        int rem,res=0;
        while(n!=0){
            rem=n%10;
            res+=Math.pow(rem, 3); // 157= 1^3 + 5^3 + 7^3 ->157
            n/=10;
        }
        if(res==originalNum){
            System.out.println("It is an armstrong number");
        }else{
            System.out.println("Not an armstrong number");
        }
    }
}
