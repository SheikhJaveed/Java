import java.util.*;
public class arrays {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        //int []marks = new int[3];
        //int marks[] = new int[3];   both are valid
        // marks[0]=97;
        // marks[1]=98;
        // marks[2]=96;
        // int marks[]={1,2,3,4,5};
        System.out.println("Enter the array size:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int numbers[]=new int[size];
        System.out.println("Enter elements:");
        //input
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        //output
        System.out.println("Array elements are:");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]); //auto initialisation will give values 00000 if input is not given
        }
    }
}
