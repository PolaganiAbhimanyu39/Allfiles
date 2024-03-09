import java.util.Scanner;
class MyException extends Exception
{
    MyException(String msg)
    {
        super(msg);
    }
}
public class CustomException 
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number other than 99: ");
        try
        {
            int inp = sc.nextInt();
            if(inp==99) throw new MyException("You can't enter 99");
        }
        catch(MyException e)
        {
            System.out.println(e);    
        }
    }
}
