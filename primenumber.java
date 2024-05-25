import java.util.*;
public class primenumber {
    public static void isPrime(int n){
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n==1){
                System.out.println("Neither prime nor composite");
                break;
            }   
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isPrime(n);
    }
}
