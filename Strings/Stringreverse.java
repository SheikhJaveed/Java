public class Stringreverse {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        //prgoram to reverse a string
        for(int i=0;i<sb.length()/2;i++){
            int front = i;       // to find the indexes of hello
            int back = sb.length()-1-i;  //5-1-0=4th position --> o

            char frontChar=sb.charAt(front); //to get single char like h, e, ..
            char backChar=sb.charAt(back);

            sb.setCharAt(front,backChar); //to replace back characters with front characters
            sb.setCharAt(back,frontChar);
        }
    System.out.println(sb);
    }
}
