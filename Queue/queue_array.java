public class queue_array {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1; //since we are making using array we already have front as 0

        Queue(int size){
            arr = new int[size];
            this.size = size; 
        }

        public static boolean isEmpty(){
            return rear ==-1;
        }

        //add
        public static void add(int data){
            if(rear == size-1){
                System.out.println("full queue");
                return;
            }
            
            rear++;
            arr[rear] = data;
        }

        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[0]=arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[0];
            
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek()); //1

        while(!q.isEmpty()){
            System.out.println(q.peek()); 
            q.remove(); //if we don't remove elements and just peek() the queue it will print 1 infinitely
        }
        //time complexity of add()- O(1)
        //time complexity of remove() and peek()- O(n) because there is a for loop
    }
}
