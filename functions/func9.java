import java.util.*;
public class func9 {
    //program to find circumference
    //use import static java.lang.Math.*; for maths functions
    public static void circumference(int r){
        double pi=3.14;
        double c=2*pi*r;
        System.out.println("Circumferece is "+c);
    }

    public static void main(String[] args) {
        System.out.println("Enter the radius");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        circumference(r);
    }
}
