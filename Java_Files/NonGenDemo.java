// NonGen is functionally equivalen to Gen
// but does not use generics
class NonGen
{
    Object ob;  //  ib is now of type Object

    // Pass the constructor a reference to 
    // an object of type Object
    NonGen(Object o)
    {
        ob = o;
    }

    //  Return type Object.
    Object getOb()
    {
        return ob;
    }

    //  Show type of ob.
    void showType()
    {
        System.out.println("Type of ob is "+ob.getClass().getName());
    }
}

//  Demonstrate the non-generic class.

public class NonGenDemo 
{
    public static void main(String[] arg)
    {
        NonGen iOb;

        //  Create NonGen object and store
        //  an Integer in it. Autoboxing still occurs.
        //Since the constructor of the Demo class takes an Object parameter, the int 99 is autoboxed into an Integer object.
        iOb = new NonGen(88);

        //  Show the type of data used by iOb.
        iOb.showType();

        //  Get the value of iOb.
        //  This time, a cast is necessary
        int v = (Integer)iOb.getOb();
        System.out.println("value: "+v);

        System.out.println();

        //  Create another NonGen object and
        //  store a String in it.
        NonGen strOb = new NonGen("Non-Generics test");

        //  Show the type of data used by strOb.
        strOb.showType();

        //  GEt the value of strOb.
        //  Again, notice that a cast is necessary.
        String str = (String)strOb.getOb();
        System.out.println("value: "+str);

        //  This compiles, but is conceptually wrong!
        iOb = strOb;// When generics are used we can avoid run-time error coz this statement will generate a compile-time-error.
        v = (Integer)iOb.getOb();   //  run-time error
    }
}
