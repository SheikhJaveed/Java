//stack implementation using Linked List
public class Stack_LL {
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Stack{
        public static Node head = null;     //initially head is nulls

        //push element
        public static void push(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static boolean isEmpty(){
            return head == null; //comapares head and null if they are equal returns true or else return false
        }

        //pop - deletes the element and also returns the element
        public static int pop(){
            if(isEmpty()){
                return -1;  // no element is present so return -1
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

        //peek() method in Java is used to retrieve or fetch the first element of the Stack or the element present at the top of the Stack. The element retrieved does not get deleted or removed from the Stack.
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            return top.data;
        }
    }

    //Note-The only difference between peek and pop is that the peek method just returns the topmost element; however, in the case of a pop method, the topmost element is returned and also that element is deleted from the stack.
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()){    //while stack is not empty 
            System.out.println(stack.peek()); //gives topmost element
            stack.pop();   // removes element from the stack and also returns it
        }
    }
}
