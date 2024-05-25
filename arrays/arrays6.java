import java.util.Scanner;  //.Scanner - imports scanner class 
                           //.* * imports all classes
public class arrays6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num[]= new int[size];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        boolean isAscending=true;
        for(int i=0;i<num.length-1;i++){  //we are going till last second element because we need to compare the last element also
            if(num[i]>num[i+1]){
                isAscending=false;
            }
        }
        if(isAscending){
            System.out.println("Array is in ascending order");
        }else{
            System.out.println("Array is not in ascending order");
        }
    }
}
