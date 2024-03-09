import java.util.Scanner;
public class Try_Demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;int res;
        int b;
        try{
            System.out.print("Enter a number: ");
            a = sc.nextInt();
            System.out.print("Enter another number: ");
            b = sc.nextInt();
            res=a/b;
            System.out.println("You will not see this");
        }
        catch(ArithmeticException ex){
            System.out.println("Exception: "+ex);
        }
    }
}
