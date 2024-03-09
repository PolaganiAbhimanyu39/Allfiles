// A simple generic class.
// Here, D is a type parameter that
// will be replaced by a real type
// when an object of type Gen is created.
class Gen<D>
{
    D ob;   //  Declare an object of type D.
    Gen(D o)
    {
        ob = o;
    }

    //  Return an ob.
    D getOb()
    {
        return ob;
    }

    //  Show type of D.
    void showType()
    {
        System.out.println("Type of D is "+ob.getClass().getName());
    }
}
//  Demonstrate the generic class.
public class GenDemo 
{
    public static void main(String[] arg)
    {
        //  Create a Gen reference for Integers.
        Gen<Integer> iOb;

        // Create a Gen<Integer> object and assign its 
        // reference to iOb. Notice the use of autoboxing
        // to encapsulate the value 88 within an Integer object.
        iOb = new Gen<Integer>(88);

        // Show the type of data used by iOb.
        iOb.showType();

        //  Get the value in iOb. Notice that
        // no cast is needed.
        int v = iOb.getOb();
        System.out.println("value: "+v);

        System.out.println();

        //  Create a Gen object for Strings.
        Gen<String> strOb = new Gen<String>("Generics Test");

        //  Show the type of data used by strOb.
        strOb.showType();

        //  Get the value if strOb. Again, notice
        //  that no cast is needed.
        String str = strOb.getOb();
        System.out.println("value: "+str);
    }
}