// Demonstrate thread groups.
class NewThread21 extends Thread
{
    boolean suspendFlag;
    NewThread21(String threadname, ThreadGroup tgOb)
    {
     super(tgOb, threadname);
        System.out.println("New Thread: "+this);
        suspendFlag = false;
        start();    // Start the thread
    }
    //  This is the entry point for thread
    public void run()
    {
        try
        {
            for(int i = 5;i>0;i--)
            {
                System.out.println(getName()+": "+i);
                Thread.sleep(1000);
                synchronized(this){
                    while(suspendFlag)
                    {
                        wait();
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception in "+getName());
        }
        System.out.println(getName()+" exiting.");
    }
    void mysuspend()
    {
        suspendFlag = true;
    }
    synchronized void myresume()
    {
        suspendFlag = false;
        notify();
    }
}
public class ThreadGroupDemo {
public static void main(String[] args)
{
    ThreadGroup groupA = new ThreadGroup("Group A");
    ThreadGroup groupB = new ThreadGroup("Group B");

    NewThread21 ob1 = new NewThread21("One",groupA);
    NewThread21 ob2 = new NewThread21("Two",groupA);
    NewThread21 ob3 = new NewThread21("Three",groupB);
    NewThread21 ob4 = new NewThread21("Four",groupB);

    System.out.println("\nHere is output from list():");
    groupA.list();
    groupB.list();
    System.out.println();

    System.out.println("Suspending Group A");
    Thread tga[] = new Thread[groupA.activeCount()];
    groupA.enumerate(tga);  //  get threads in group
    for(int i = 0;i<tga.length;i++)
    {
        ((NewThread21)tga[i]).myresume();   //  resume threads in group
    }
    try
    {
        Thread.sleep(4000);
    }
    catch (InterruptedException e)
    {
        System.out.println("Main thread interrupted.");
    }

    System.out.println("Resuming group A");
    for(int i = 0;i<tga.length;i++)
    {
        ((NewThread21)tga[i]).myresume();   //  resume threads in group
    }

    //  wait for threads to finish
    try
    {
        System.out.println("Waiting for threads to finish.");
        ob1.join();
        ob2.join();
        ob3.join();
        ob4.join();
    }
    catch(Exception e)
    {
        System.out.println("Exception in main thread");
    }
    System.out.println("Main thread exiting.");
}
}