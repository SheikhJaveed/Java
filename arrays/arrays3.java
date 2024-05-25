import java.util.*;
public class arrays3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        String names[]=new String[size];  //we take string datatype because we are printing names
        System.out.println("Enter the names:");
        //input
        for(int i=0;i<size;i++){
            names[i]=sc.next();
        }
        //output
        for(int i=0;i<names.length;i++){
            System.out.println("name "+(i+1)+" is "+names[i]);
        }
    }
}
