// Create a second thread.
class NewThread1 extends Thread
{
    NewThread1()
    {
        // Create a new, second thread
        super("Demo Thread");
        System.out.println("Child thread: "+this);
        start(); // Start the thread
    }
    // This is the entry point for the second thread.
    public void run()
    {
        try
        {
            for(int i = 5;i>0;i--)
            {
                System.out.println("Child thread: "+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Child thread: interrupted");
        }
        System.out.println("Child thread: exiting");
    }
}
public class ThreadDemo1
{
    public static void main(String[] args)
    {
        new NewThread();    //  create a new thread
        try
        {
            for(int i = 5;i>0;i--)
            {
                System.out.println("Main thread: "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread: interrupted");
        }
        System.out.println("Main thread: exiting");
    }
}