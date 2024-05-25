import java.util.LinkedList;

//using LinkedList package directly
public class linked_list2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        
        list.addFirst("this");
        list.add(3,"new");
        list.add("list"); //.add() adds node at the end by default
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1); //removes at a paarticular index
        System.out.println(list);
    }
}
