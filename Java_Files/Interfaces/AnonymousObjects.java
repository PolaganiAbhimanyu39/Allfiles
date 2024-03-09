class A1
{
   A1()
   {
       System.out.println("Object created");
   }
   void show()
   {
       System.out.println("Inside A1's show method");
   }
}
public class AnonymousObjects
{
    public static void main(String[] args)
    {
        new A1();  // you created an object of class A1.
        new A1().show();  // you can even call methods.
        // 2 objects are created when u execute the above code, these objects are called anonymous coz
        // they have no reference and you can't reuse these objects.
        A1 a = new A1(); // This is a reference object.
    }
}
