interface A
{
    public void show();
}
public class InterfaceAnonymousInnerClass 
{
    public static void main(String[] args)
    {
    A obj = new A()
    {       // Using anonymous class you can define implementation of interface methods.
        public void show()
        {
            System.out.println("Hello");
        }
    };
    obj.show();
}
}
