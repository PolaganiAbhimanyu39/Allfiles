// Demonstrate a single generic method

public class GenericMethod 
{

    // Demonstrate if an object is in an array
    static <T,V extends T> boolean isIn(T x, V[] y)
    {
        for(int i = 0;i<y.length;i++) if(x.equals(y[i])) return true;
        return false;
    }
    public static void main(String[] arg)
    {
        // Use isIn() on Integers
        Integer[] arr = {1,2,3,4,5,6};
        if(isIn(3,arr)) System.out.println("2 is in Integer array");
        if(!isIn(7,arr)) System.out.println("7 is not in Integer array");
        System.out.println();

        // Use inIn() on Strings
        String[] sarr = {"one","two","three","four","five"};
        if(isIn("two",sarr)) System.out.println("two is in Strings array");
        if(!isIn("six",sarr)) System.out.println("six is not in Strings array");

        // below code won't compile 
        // if(isIn("two",arr)) System.out.println("two is in Integer array");
    }
}