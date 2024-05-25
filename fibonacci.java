import java.util.*;
public class fibonacci {
    public static void fibseries(int n){
        int a=0,b=1,c;
        if(n>1){
            for(int i=0;i<n;i++){
                System.out.print(a+" ");
                c=a+b;
                a=b;
                b=c;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n= sc.nextInt();
        fibseries(n);
    }
}
