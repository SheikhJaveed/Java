import java.util.*;
public class String_format {
    public static void main(String[] args) {
        String s1 = new String("Hello world");
        String s2 = "GeeksforGeeks";
        String s = String.format("My answer is %.8f",47.65734);
        String s3 = String.format("My answer is %15.8f",47.65734);
        String s4 =String.format("%-15s", "Java is great"); //prints normally
        String s5 =String.format("Java program %-15s correct","is"); //prints by leaving spaces
        String s6 = String.format("My answer is %015f",47.65734);  //padding with zero
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        

        // -15s -> left shift (String starts from the beginning)
        // 15s -> right shift (starts after leaving spaces at the beginning)
        //input
        //this code gives space between a string and a number 
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int d = sc.nextInt();
        String x1 = String.format("%-15s", x); //(%-15s) to bring the string to its original position(at the beginning) and then give space after the string 
        String d1 = String.format("%03d", d); //for padding with zeroes
        System.out.println(x1+d1);
    }
}
