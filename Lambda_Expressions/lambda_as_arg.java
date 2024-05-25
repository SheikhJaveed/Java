// Functional interface with a single abstract method

interface MyFunction {
    void doSomething();
}

// A method that accepts a functional interface as an argument
public class lambda_as_arg{
    public static void myMethod(MyFunction func) {
        // Execute the lambda expression
        func.doSomething();
    }

    public static void main(String[] args) {
        // Using lambda expression as an argument
        myMethod(() -> {
            System.out.println("Executing lambda expression");
        });
    }
}
