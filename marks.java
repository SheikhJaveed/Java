import java.util.*;
public class marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        do{
            int marks=sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("Excellent");
            }else if(marks>=60 && marks<=89){
                System.out.println("Good");
            }else if(marks>=0 && marks<=59){
                System.out.println("this is also good");
            }else{
                System.out.println("invalid");
            }
            System.out.println("Do you want to continue? yes(1) or no(0)");
            input=sc.nextInt();
        }while(input==1);
    }
}
