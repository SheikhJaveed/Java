class Stack {
    private int maxSize; // size of stack array
    private int[] stackArray;
    private int top; // top of stack

    // Constructor to initialize stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push an element onto the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full, cannot push element " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int value = stackArray[top--];
            System.out.println(value + " popped from stack");
            return value;
        }
    }

    // Peek the top element of the stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}

public class stack_using_constructor {
    public static void main(String[] args) {
        Stack stack = new Stack(5); // Create a stack of size 5

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Try pushing more elements than the stack size
        stack.push(60);

        // Peek the top element of the stack
        System.out.println("Top element of the stack: " + stack.peek());

        // Pop elements from the stack
        while (!stack.isEmpty()) {
            stack.pop();
        }
    }
}
