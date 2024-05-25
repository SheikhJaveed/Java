import java.util.HashSet;
//unique subsequences
public class string7 {
    public static void subsequences(String str, int idx, String newString,HashSet<String> set){
        if(idx == str.length()){        //note: an empty string is also printed at the end
            if(set.contains(newString)){
                return;
            } else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        //currChar included
        subsequences(str, idx+1, newString+currChar,set);

        //currChar not included
        subsequences(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "",set);
    }
}
