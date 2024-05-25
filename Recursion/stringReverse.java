// The Java String charAt() method returns the character at the specified index. The index value should lie between 0 and length() – 1. Let us check more points about the String charAt() method in Java.
public class stringReverse {
    public static void printRev(String str,int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printRev(str, index-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        printRev(str, str.length()-1);
    }
}
