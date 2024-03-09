// Use java -ea classname to enable assertion
// Use java -da classname to disable assertion
public class AssertDemo 
{
    static int val = 3;
    public static void main(String[] arg)
    {
        for(int i = 0;i<10;i++)
        {

        int n=getnum();
        assert n>0:"n cannot be zero or negative"; //  will fail when n is 0
        System.out.println("n is "+n);
        }
    }   
    static int getnum()
    {
        return val--;
    } 
}