@FunctionalInterface  // Here, you're telling the compiler that the following interface will contain only one method.
interface C
{
    void show();
}
class A
{
    public void thisMethodBelongsToThisClass()
    {
        System.out.println("In A class.");
    }
}
class B extends A
{
    @Override  // You're telling the compiler that I am overriding a method shown below.
    public void thisMethodBelongsToThisClass()
    {
        System.out.println("In B class");
    }
}
public class AnnotationsDemo 
{
    public static void main(String[] arg)
    {
        A obj = new B();
        obj.thisMethodBelongsToThisClass();
    }   
}