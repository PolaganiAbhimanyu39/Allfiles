class Demo implements Callback {
    // Implement Callback's interface
    public void callback(int p) // the methods that implement an interface must be declared public
    {
        System.out.println(" callback called with "+p);
    }
    void nonIfaceMeth()
    {
        System.out.println("Classes that implement interfaces "+"may also define other members, too.");
    }
}
// Another implementation of callback
class AnotherClient implements Callback{
    // Implement callback's interface
    public void callback(int p)
    {
        System.out.println("Another version of callback");
        System.out.println("p squared is "+(p*p));
    }
}
public class Client {
    public static void main(String[] args)
    {
        Callback c = new Demo();
        c.callback(23);
        AnotherClient a = new AnotherClient();
        c = a;
        c.callback(33);
    }
}
