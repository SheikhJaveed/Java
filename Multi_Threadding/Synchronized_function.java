// Java Program to synchronized method by
// using an anonymous class
import java.io.*;

class Test {
    synchronized void test_function(int n)
    {
        // synchronized method
        for (int i = 1; i <= 3; i++) {
            System.out.println(n + i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

// Driver Class
public class Synchronized_function {
    // Main function
    public static void main(String args[])
    {
        // only one object
        Test obj = new Test();

        Thread a = new Thread() {
            public void run() { obj.test_function(15); }
        };

        Thread b = new Thread() {
            public void run() { obj.test_function(30); }
        };

        a.start();
        b.start();
    }
}
