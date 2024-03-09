class A{
    void show()
    {
        System.out.println("Hello");
    }
}
class B extends A{
void show1()
{
    System.out.println("Bye");
}
}
public class Up_And_Down_Casting {
    public static void main(String[] args)
    {
        B b = new B();  // You can cast subclasses to superclasses
        b.show();   // up-casting(from child to parent)
        A obj = (A) b;  // This is allowed because the actual object is of type A is B
        obj.show();    // down-casting(from parent to child)
    }
}
