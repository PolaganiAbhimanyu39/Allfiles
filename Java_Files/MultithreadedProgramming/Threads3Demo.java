class TDemo extends Thread
{
    public void run()
    {
        boolean t = true;
        while(t)
        {
            System.out.println("Hello");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {

            }
        }
    }
}
class Threads3Demo
{
    public static void main(String[] arg)
    {
        TDemo e = new TDemo();
        Thread t = new Thread(e);
        e.start();
        for(;;)
        {
            try{
            System.out.println("Namaste");
        Thread.sleep(1000);}
            catch(InterruptedException o)
            {
                System.out.println(o);
            }
        }
    }
}