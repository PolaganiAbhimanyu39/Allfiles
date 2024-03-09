class Order
{
    boolean setValue = false;
    int val;
    synchronized void put(int value)
    {
        if(setValue==true)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        val = value;
        setValue = true;
        notify();
    }
    synchronized int get()
    {
        if(setValue==false)
        {
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        setValue = false;
        notify();
        return val;
    }
}
class Consumero extends Thread
{
    Order obj;
    Consumero(Order a)
    {
        obj = a;
    }
    public void run()
    {
        for(int i = 0;i<10;i++)
        {
            System.out.println("Consumer consumed: "+obj.get());
            try
            {
                sleep(10);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
class Producero extends Thread
{
    Order obj;
    Producero(Order a)
    {
        obj = a;
    }
    public void run()
    {
        for(int i = 0;i<10;i++)
        {
            System.out.println("Producer produced: "+i);
            obj.put(i);
        }
    }
}
class Main
{
    public static void main(String[] ar)
    {
        Order o = new Order();
        Producero p = new Producero(o);
        Consumero c = new Consumero(o);
        p.setPriority(Thread.MAX_PRIORITY);
        c.setPriority(Thread.MIN_PRIORITY);
        p.start();
        c.start();
    }
}