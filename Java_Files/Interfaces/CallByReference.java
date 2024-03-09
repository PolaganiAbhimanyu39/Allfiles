import java.util.Scanner;
public class CallByReference
{
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        a = sc.nextInt();
        System.out.println("Enter b value: ");
        b = sc.nextInt();
        Data d = new Data(a,b);
        Data1 d1 = new Data1();
        System.out.println("Before swapping a = "+d.a+"\tb = "+d.b);
        d1.swap(d);
        System.out.println("After swapping a = "+d.a+"\tb = "+d.b);
    }
}
class Data
{
    int a,b;
    Data(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
}
class Data1
{
    void swap(Data d)
    {
        int temp = d.a;
        d.a = d.b;
        d.b = temp;
    }
}