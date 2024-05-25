public class permutation {
    public static void printPerm(String str, String permutation){
        if(str.length()==0){
                System.out.println(permutation);
                return;
            }
        for(int i=0;i<str.length();i++){
            //if it is "abc"
            char currChar = str.charAt(i); //extracts current character say 'a'
            String newString = str.substring(0, i)+str.substring(i+1); //'a'+'c' 
            printPerm(newString, permutation+currChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");
    }
}
