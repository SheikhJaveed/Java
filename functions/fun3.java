import java.util.*;
public class fun3 {
    public static int calcProduct(int a,int b){
        int product=a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int prod=calcProduct(a, b);
        System.out.println("The product is "+prod);
    }
}
