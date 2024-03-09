//Autoboxing/unboxing takes place with method parameters and return values
public class AutoBox2
{
    // Take an Integer parameter and return an int value.
    static int m(Integer obj)
    {
        return obj; // auto-unbox to int
    }
    public static void main(String[] arg)
    {
//        Pass an int to m() and assign the return value to an Integer.
//        Here, the argument 100 is autoboxed into an Integer.
//        The return value is also autoboxed into an Integer.
        Integer iObj = m(100);
        System.out.println(iObj);
    }
}
