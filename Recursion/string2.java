public class string2 {
    public static int first = -1;
    public static int last = -1;

    public static void findOccurence(String str,int idx,char element){
        if(idx==str.length()){
            System.out.println("first index "+"= "+ first);
            System.out.println("last index "+"= "+ last);
            return;
        }
        char currChar = str.charAt(idx); //extracts a character at particular index
        if(currChar == element){
            if(first ==-1){     //if first is uninitialized then we will initialize by idx or we will update last by idx
                first =idx;     //0
            }else{
                last = idx;     //last=2(during first recursion(idx=2)) and it will traverse the whole string and updates its value and gives final idx as 10
            }
        }
        findOccurence(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurence(str, 0, 'a');
    }
}
