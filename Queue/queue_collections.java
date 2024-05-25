import java.util.*;
public class queue_collections {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); //queue is an interface and is implemented in java using LinkedList and Arraydeque
        // Queue<Integer> q = new ArrayDeque<>();  
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
