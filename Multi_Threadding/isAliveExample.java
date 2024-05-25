public class isAliveExample {

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

        // Check if the thread is alive
        if (myThread.isAlive()) {
            System.out.println("Thread is alive.");
        } else {
            System.out.println("Thread is not alive.");
        }

        // Wait for the thread to finish
        try {
            myThread.join(); // Wait for the thread to finish execution
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Check if the thread is alive again after it finishes
        if (myThread.isAlive()) {
            System.out.println("Thread is alive.");
        } else {
            System.out.println("Thread is not alive.");
        }
    }
}
