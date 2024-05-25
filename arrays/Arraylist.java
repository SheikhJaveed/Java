import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        //we use classes of datatypes to create integers like Integer,Float,String..etc
        //declaration of arraylist
        ArrayList<Integer> list = new ArrayList<Integer>(); //we can write as new ArrayList<>(); also

        //add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get element
        int element = list.get(0);
        System.out.println(element);

        //adding element in between
        list.add(1,1); //.add(index,element);
        System.out.println(list);

        //set element
        list.set(0, 5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);
        
        //size
        System.out.println(list.size());

        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        Collections.sort(list); //collections is a framework which contains DSA methods like sorting and all
        System.out.println(list);
    }
}
