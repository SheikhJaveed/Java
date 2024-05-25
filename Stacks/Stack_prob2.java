import java.util.Stack;

public class Stack_prob2 {
    public static void pushBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){ //base case
            s.push(data);   //we will push 4 here 
            return;
        }
        int top = s.pop();  //topmost element is removed
        pushBottom(data, s); //recursion 
        s.push(top); //after adding 4 at bottom new elements are added like 1,2,3
    }

    //reverse stack
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop(); //removes topmost element
        reverse(s); //recursion
        pushBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);  //this stack is 3,2,1

        reverse(s); //reverse will be 1,2,3
        while(!s.isEmpty()){    
            System.out.println(s.peek());
            s.pop();
        }
    }
}

