//program to find an element and return the index

import java.util.LinkedList;
public class problem_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(8);
        System.out.println(list);

        for(int i=0;i<list.size();i++){
            if(list.get(i)==7){
                System.out.println(i);
            }
        }
    }
}
