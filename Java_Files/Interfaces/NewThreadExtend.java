class NewThread3 extends Thread
{
    NewThread3()
    {
        super("Demo thread");
        System.out.println("Child thread "+this);
        start();
    }
    public void run()
    {
        try
        {
            for(int i = 5;i>0;i--)
            {
                System.out.println("Child thread "+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Child interrupted");
        }
        System.out.println("Child thread exiting.");
    }
}
public class NewThreadExtend {
    public static void main(String[] args)
    {
        NewThread3 tr = new NewThread3();
        try
        {
            for(int i = 5;i>0;i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
