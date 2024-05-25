import java.util.*;
public class updateBit {
    public static void main(String[] args) {
        System.out.println("Enter to update the bit to 0 or 1:");
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //if oper :1 -> set bit
        //if oper :0 -> clear bit
        int n=5;
        int pos=1;
        int bitMask =1<<pos;
        if(oper ==1){
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }else{
            int notbitMask = ~(bitMask);
            int newNumber = notbitMask & n;
            System.out.println(newNumber);
        }
    }
}
