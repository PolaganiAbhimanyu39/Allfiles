// Autoboxing/unboxing occurs inside expressions.
public class AutoBox3
{
    public static void main(String[] arg)
    {
        Integer iOb1, iOb2;
        Double dOb = 98.6;
        int i;
        iOb1 = 100;
        System.out.println("Original value of iOb1: "+iOb1);
        // The following automatically unboxes iOb1,
        // performs the increment, and then reboxes
        // the result back into iOb.
        ++iOb1;
        System.out.println("After ++iOb1: "+iOb1);
        // Here, iOb1 is unboxed, the expression is
        // evaluated, and the result is reboxed and
        // assigned to iOb2.
        iOb2 = iOb1+(iOb1/3);
        System.out.println("iOb2 after expression: "+iOb2);

        // The same expression is evaluated, but the
        // result is not reboxed.
        i = iOb1+(iOb1/3);
        System.out.println("i after expression: "+i);
        // Auto-unboxing also allows you to mix different types of numeric objects in an expression.
        // once the values are unboxed, the standard type promotions and conversions are applied.
        dOb = dOb+iOb1;
        System.out.println("dOb after expression: "+dOb);
        // Because of auto-unboxing you can use integer numeric objects to control a switch statement.
        switch (iOb1)
        {
            case 100-> System.out.println("One hundred");
            case 101-> System.out.println("One hundred and one");
            default -> System.out.println("Error");
        }
    }
}
