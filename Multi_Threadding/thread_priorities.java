class thr1 extends Thread{
    thr1(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while(i<2000){
            System.out.println("Thank you "+ this.getName());
            i++;
        }
    }
}
public class thread_priorities {
    public static void main(String[] args) {
        thr1 t1 = new thr1("harry1");
        thr1 t2 = new thr1("harry2");
        thr1 t3 = new thr1("harry3");
        thr1 t4 = new thr1("harry4");
        thr1 t5 = new thr1("harry5(most important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY+1); //we can add/subtract only for norm priority
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
