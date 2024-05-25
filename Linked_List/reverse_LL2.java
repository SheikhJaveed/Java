import java.util.LinkedList;
import java.util.Collections;
public class reverse_LL2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        Collections.reverse(list);
        System.out.println(list);
    }
}
