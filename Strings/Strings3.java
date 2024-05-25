public class Strings3 {
    public static void main(String[] args) {
        // .sunstring(beginning index, end index) --> excludes end index
        String sentence="My name is Tony";
        String name= sentence.substring(11,sentence.length());
        System.out.println(name);

        String sentence1="TonyStark";
        String name2= sentence1.substring(0,4);
        System.out.println(name2);

        String sentence3="TonyStark";
        String name3= sentence3.substring(4); //by default it takes end index as last index
        System.out.println(name3);
    }
}
