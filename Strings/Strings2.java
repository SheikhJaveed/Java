public class Strings2 {
    public static void main(String[] args) {
        // s1>s2 : +ve value
        // s1==s2 : 0
        // s1<s2 : -ve value
        String name1="tony";
        String name2="tony2";
        if(name1.compareTo(name2)==0){   // if(name1.equals(name2)) will also give the same output
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

         if(name1==name2){      //this fails in some cases hence we don't use it
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        //we created a new string but it gives not equal even though they are equal
         if(new String("Tony")==new String("Tony")){ 
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}
