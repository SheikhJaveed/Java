import java.util.*;
public class lcm {
    public static void LCM(int n1,int n2){
        int max;
        if(n1>n2){
            max = n1;
        }else{
            max = n2;
        }
        while(true){
            if(max%n1==0 && max%n2==0){
                break;
            }
            max++;
        }
        System.out.println("LCM is "+ max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int n2 = sc.nextInt();
        LCM(n1, n2);
    }
}
