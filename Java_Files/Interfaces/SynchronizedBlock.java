class Callme2
{
    void call(String msg)
    {
        System.out.print("["+msg);
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
class Caller2 implements Runnable
{
    String msg;
    Callme2 target;
    Thread t;
    public Caller2(Callme2 targ, String s)
    {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }
    public void run()
    {
        synchronized (target) { // Synchronized block
            target.call(msg);
        }
    }
}
public class SynchronizedBlock
{
    public static void main(String[] args)
    {
        Callme2 target = new Callme2();
        Caller2 obj1 = new Caller2(target,"Hello");
        Caller2 obj2 = new Caller2(target,"Synchronized");
        Caller2 obj3 = new Caller2(target,"World");

        // wait for threads to join
        try
        {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Interrupted");
        }
    }
}