import java.util.Scanner;
public class CallByReference1
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter a value: ");
        Integer obj1 = new Integer(sc.nextInt());
        System.out.println("Enter b value: ");
        Integer obj2 = new Integer(sc.nextInt());
    }
}
