class Buffer
{
    int buffer;
    boolean setValue=false;
    synchronized void put(int value)
    {
        if(setValue==true)
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
            buffer = value;
            setValue=true;
            notifyAll();
    }
    synchronized int get()
    {
        if(setValue==false)
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        setValue=false;
        notifyAll();
        return buffer;
    }
}
class Consumer extends Thread
{
    Buffer b;
    Consumer(Buffer b)
    {
        this.b = b;
    }
    public void run()
    {
        int value;
        for(int i = 0;i<10;i++)
        {
            value = b.get();
            System.out.println("Consumer consumed: "+value);
        }
    }
}
class Producer extends Thread
{
    Buffer b;
    Producer(Buffer b)
    {
        this.b = b;
    }
    public void run()
    {
        for(int i = 0;i<10;i++)
        {
            int value = i*3;
            b.put(value);
            System.out.println("Producer produced: "+value);
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
class Rough5
{
    public static void main(String[] arg)
    {
        Buffer b = new Buffer();
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);
        p.setPriority(Thread.MAX_PRIORITY);
        c.setPriority(Thread.MIN_PRIORITY);
        p.start();
        c.start();
    }
}