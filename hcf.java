import java.util.*;
public class hcf {
    public static void gcd(int n1,int n2){
        int HCF=1;
        int min;
        if(n1>n2){
            min = n2;
        }else{
            min =n1;
        }
        for(int i=1;i<=min;i++){
            if(n1%i==0 && n2%i==0){
                HCF = i;
            }
        }
        System.out.println("HCF is " + HCF);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int n2 = sc.nextInt();
        gcd(n1, n2);
    }
}
