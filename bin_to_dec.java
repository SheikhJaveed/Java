import java.util.*;
public class bin_to_dec {
    public static void main(String[] args) {
        System.out.println("Enter a binary number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsave,rem,d,j=1,dec=0;  //j=1 is to multiply powers of 2
        nsave = n; //to save the input 
        while(n>0){
            rem = n%10;
            d = rem*j; 
            dec +=d;
            j=j*2;  //2,4,8,16 (powers of 2)
            n/=10;
        }
        System.out.println("Binary number = "+ nsave +"\n"+"Decimal number = "+ dec);
    }
}
