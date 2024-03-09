@FunctionalInterface
interface A
{
    int product(int i, int j);
}
public class LambdaReturnDemo 
{
    public static void main(String[] arg)
    {
        A obj = (i,j)-> // In a returning lambda expression if you've only one that's the return statement 
        {               // suppose you're returning i*b. Don't write "return i*b" instead just i*b.
            System.out.print("Hello ");
            return i*j;
        };                                    
            int res = obj.product(5,8);   
            System.out.print(res);                                
    }
}
