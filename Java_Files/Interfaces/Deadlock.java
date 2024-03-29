// An example of deadlock
class A
{
    synchronized void foo(B b)
    {
        String name = Thread.currentThread().getName();
        System.out.println(name+" entered A.foo");
        try {Thread.sleep(1000);} catch(InterruptedException e) {}
        System.out.println(name+" trying to call B.last()");
        B.last();
    }
    synchronized void last()

    {
        System.out.println("Inside A.last");
    }
}
class B
{
    synchronized void bar(A a)
    {
        String name = Thread.currentThread().getName();
        System.out.println(name+" entered B.bar");
        try{Thread.sleep(1000); }catch(InterruptedException e){}
        System.out.println(name+" trying to call A.last()");
        a.last();
    }
    synchronized static void last()
    {
        System.out.println("Inside A.last");
    }
}
public class Deadlock implements  Runnable{
    A a = new A();
    B b = new B();
    Deadlock()
    {
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RacingThread");
        t.start();
        a.foo(b);   // get lock on a in this thread.
        System.out.println("Back in main thread.");
    }
    public void run()
    {
        b.bar(a);   // get lock on b in other thread.
        System.out.println("Back in other thread.");
    }
    public static void main(String[] args)
    {
        new Deadlock();
    }
}
