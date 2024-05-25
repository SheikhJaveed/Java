import java.util.Scanner;

public class fun7 {
    public static void avg(int n1,int n2,int n3){
        int avrg=(n1+n2+n3)/3;
        System.out.println("Average is "+avrg);

    }
    public static void main(String[] args) {
        System.out.println("Enter the 3 numbers:");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        avg(n1, n2, n3);
    }
}
