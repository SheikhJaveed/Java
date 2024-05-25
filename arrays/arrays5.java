import java.util.*;
public class arrays5 {
    public static void main(String[] args) {
        //program to know about max and min value in java
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num[]= new int[size];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>max){ //comparing numbers 
                max=num[i];       
            }
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("Largest number is "+ max);
        System.out.println("Smallest number is: "+ min);
    }
}
