public class string6 {
    public static void subsequences(String str, int idx, String newString){
        if(idx == str.length()){        //note: an empty string is also printed at the end
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //currChar included
        subsequences(str, idx+1, newString+currChar);

        //currChar not included
        subsequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}
