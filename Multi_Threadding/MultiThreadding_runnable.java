
class myThread1 implements Runnable{
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("Running thread 1");
            System.out.println("Start");
            i++;
        }
    }
}
class myThread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("Running thread 2");
            System.out.println("End");
            i++;
        }
    }
}
public class MultiThreadding_runnable {
    public static void main(String[] args) {
        myThread1 t1= new myThread1();
        Thread a= new Thread(t1);

        myThread2 t2 = new myThread2();
        Thread b= new Thread(t2);
        a.start();
        b.start();
    }
}
