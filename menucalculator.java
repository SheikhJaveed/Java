import java.util.*;
public class menucalculator {
    public static void main(String[] args) {
        System.out.println("Enter 1 -additon\n2-subtraction\n3-multiplication\n4-division");
        System.out.println("Enter 2 numbers:");
        Scanner sc=new Scanner(System.in);
        int operator=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch(operator){
            case 1:System.out.println("sum is "+a+b);
            break;
            case 2:System.out.println("diff is "+(a-b));
            break;
            case 3:System.out.println("multiplication is "+a*b);
            break;
            case 4: if(b==0){
                System.out.println("Invalid division");
            }   else{
                System.out.println("division is"+a/b);
            }
            break;
            default:System.out.println("Invalid input");
        }
    }
}
