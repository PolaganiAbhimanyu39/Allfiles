class Qq {
    int n;

    synchronized int get() {
        System.out.println("Got: "+n);
        return n;
    }

    synchronized void put(int x) {
        this.n = x;
        System.out.println("Put: "+n);
    }
}

class Producer implements Runnable {
    Qq q;

    Producer(Qq q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Qq q;

    Consumer(Qq q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            q.get();
        }
    }
}

public class SynchProd_Cons {
    public static void main(String[] args) {
        Qq q = new Qq();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press Control-C to stop");
    }
}
