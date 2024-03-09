// A simple demonstration of abstract
abstract class A{
    abstract void callMe();
    // concrete methods are still allowed in abstract classes
    void callMeToo()
    {
        System.out.println("This is a concrete method.");
    }
}
class B extends AbstractDemo{
    void callMe()
    {
        System.out.println("B's implementation of callMe.");
    }
}
class Demo{
    public static void main(String[] args)
    {
        B a = new B();
        a.callMe();
        a.callMeToo();
    }
}