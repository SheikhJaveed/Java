import java.util.Scanner;

public class perfect_num {
    public static void main(String[] args) {
        //perfect number -> sum of all divisors of a number should be equal to the number itself. e.g: 28
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,orgNum=n;
        for(int i=1;i<n;i++){
            if(n%i==0){
                count+=i;
            }
        }
        if(count==orgNum){
            System.out.println("Perfect number");
        }else{
            System.out.println("Not a perfect number");
        }
    }
}
