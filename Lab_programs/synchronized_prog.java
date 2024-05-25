class A
{
synchronized void displayTable(int n)
{ 
    try{
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*n);
            Thread.sleep(1000);
    }
}
    catch(Exception e)
    {}
    }
}

class Mul extends Thread
{
    A a;int n;
    Mul(A a,int n)
    {   this.n=n;
        this.a=a;
        }
        public void run()
        {
            a.displayTable(n);
        }
}

public class synchronized_prog
{
    public static void main(String args[])
    {
        A a=new A();
        Mul m=new Mul(a,8);
        Mul m1=new Mul(a,9);
        m.start();
        m1.start();
        }
}