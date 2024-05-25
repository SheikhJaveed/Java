import java.util.*;
public class Strings9 {
    public static void main(String[] args) { //we are replacing letter e by i in original string
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        String result = "";
        for(int i=0;i<original.length();i++){
            if(original.charAt(i)=='e'){
                result+='i';              //result = result +'i';
            }else{
                result+=original.charAt(i);
            }
        }
        System.out.println(result);
    }
}
