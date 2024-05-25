import java.util.*;
public class arrays2 {
    public static void main(String[] args) {
        //linear search
        System.out.println("Enter the array size:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        System.out.println("Enter elements:");
        //input
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int x=sc.nextInt();
    
        //output
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("Element found at index "+i);
            }
        }
    }
}