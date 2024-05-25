
class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("Running thread 1");
            System.out.println("Start");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("Running thread 2");
            System.out.println("End");
            i++;
        }
    }
}
public class MultiThreadding {
    public static void main(String[] args) {
        MyThread1 t1= new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
