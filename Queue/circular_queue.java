public class circular_queue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1; 

        Queue(int size){
            arr = new int[size];
            this.size = size; 
        }

        public static boolean isEmpty(){
            return rear ==-1 && front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        //add
        public static void add(int data){
            if(isFull()){
                System.out.println("full queue");
                return;
            }
            
            if(front == -1){
                front =0;
            }
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        //dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int res = arr[front];
            if(front == rear){
                front = rear = -1;
            }
            else{
                front = (front+1)%size;
            }
            return res;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
            
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove()); //removed 1 from front 
        q.add(6);   //(5+1)%6 = 0 so 6 goes to index 0
        System.out.println(q.remove()); //removed 2 
        q.add(7);   //(4+1)%6 = 1 so 7 goes to index 1


        while(!q.isEmpty()){
            System.out.println(q.remove()); 
        }
        //time complexity of add(),remove(),peek()- O(1)
    }
}
