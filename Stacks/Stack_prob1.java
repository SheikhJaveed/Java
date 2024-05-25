import java.util.Stack;
import java.util.Collections;

public class Stack_prob1 {
    public static void pushBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){ //base case
            s.push(data);   //we will push 4 here 
            return;
        }
        int top = s.pop();  //topmost element is removed
        pushBottom(data, s); //recursion 
        s.push(top); //after adding 4 at bottom new elements are added like 1,2,3
    }
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushBottom(4, s);
        while(!s.isEmpty()){    
            System.out.println(s.peek());
            s.pop();
        }
    }
}
