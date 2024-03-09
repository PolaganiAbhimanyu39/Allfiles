class  One
{
    int i;
    One(int i)
    {
        this.i = i;
    }
}
class Two extends One
{
    int i;
    Two(int a, int b)
    {
        super(a);
        i = a;
    }
    void show()
    {
        System.out.println("Sub class i = "+i);
        System.out.println("Super class i = "+super.i);
        System.out.println();
    }
}
public class SirTold {
    public  static void main(String[] args)
    {
        Two obj = new Two(10,20);
        obj.show();
    }
}
