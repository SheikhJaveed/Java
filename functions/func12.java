import java.util.*;
public class func12 {
    public static void count(){
        int positives=0,negatives=0,zeroes=0;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input==1){
            System.out.println("Enter the number:");
            int n=sc.nextInt();             
            if(n>0){
                positives++;
            }else if(n<0){
                negatives++;
            }else{
                zeroes++;
            }
            System.out.println("Enter 1 to continue ad zero to stop:"); 
            input=sc.nextInt();  
            /*everytime we take input n we need to ask the user again for the choice(0 or 1) so we keep this statement inside the loop*/ 
        } 
        System.out.println("positives: "+positives);
        System.out.println("negatives: "+negatives);
        System.out.println("zeroes: "+zeroes);
    }
    public static void main(String[] args) {
        System.out.println("Enter 1 to continue and 0 to stop:");
        count();
    }
}
