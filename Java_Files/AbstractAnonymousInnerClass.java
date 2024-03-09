abstract class A
{
    public abstract void show();
    public abstract void config();
}
public class AbstractAnonymousInnerClass 
{
    public static void main(String[] arg)
    {
        A obj = new A()   // Here, A refers to below class, not the abstract class defined above.
        {
            public void show()
            {
                System.out.println("In abstract anonymous class");
            }
            public void config()
            {
                System.out.println("in config");
            }
        };
        obj.show();
        obj.config();
    }
}