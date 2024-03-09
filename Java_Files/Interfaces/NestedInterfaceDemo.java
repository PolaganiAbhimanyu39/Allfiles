class demo
{
    public interface nest
    {
        boolean isNotNegative(int num);
    }
}
class demo1 implements demo.nest
{
   public boolean isNotNegative(int num)
    {
        return num >= 0;
    }
}
public class NestedInterfaceDemo {
    public static void main(String[] args)
    {
        demo1 a = new demo1();
        demo.nest b = a;
        if(b.isNotNegative(-12)) System.out.println("You won't see this");
    }
}
