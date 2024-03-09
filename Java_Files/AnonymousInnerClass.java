class A
{
    void show()
    {
        System.out.println("In A show");
    }
}
class AnonymousInnerClass
{
    public static void main(String[] arg)
    {
        A obj = new A()
        {                   // This is anonymous inner class.
                void show()
            {
                System.out.println("In new show");
            }
        };
        obj.show();
    }
}