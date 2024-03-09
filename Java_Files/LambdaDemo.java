
@FunctionalInterface
interface A
{
    void show(int i, int j);
}
public class LambdaDemo 
{
    public static void main(String[] arg)
    {
        A obj = (i,j)->
        {
            System.out.println(i*j);    // Notice, that unlike anonymous class here you don't even
        };                                    // get a .class file.
            obj.show(5,8);                                   
    }
}
