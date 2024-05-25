public class JoinExample {

    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            // Simulate some task
            try {
                Thread.sleep(2000); // Simulate thread work for 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        myThread.start(); // Start the thread

        System.out.println("Before join() method");

        // Wait for the thread to finish
        try {
            myThread.join(); // Wait for the thread to finish execution
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("After join() method");
    }
}
