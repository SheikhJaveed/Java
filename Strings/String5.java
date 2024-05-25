public class String5 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("h");
        sb.append("e"); //in string it can be written as str=str+"e";
        sb.append("l");//str = str+"l";
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
