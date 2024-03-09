@FunctionalInterface
interface A
{
    int product(int i, int j);
}
public class LambdaReturnDemo2
{
    public static void main(String[] arg)
    {
        A obj = (i,j)-> i*j;                                  
            int res = obj.product(5,8);   
            System.out.print(res);                                
    }
}
