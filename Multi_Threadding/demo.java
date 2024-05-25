class MyThread  extends Thread{
    int sum=0;
    public void run(){
        synchronized (this){
            System.out.println("child thread");
            for(int i=0;i<=100;i++){
                sum+=i;
                System.out.println("Child thread trying to give modification");
            }
            this.notifyAll();
        }
    }
}
public class demo {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        synchronized (t1) {
            System.out.println("Main thread");
            t1.wait();
        }
        System.out.println("main thread got notified");
        System.out.println(t1.sum);
    }
}
