import java.util.Scanner;
public class ScannerDemo{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1,num2;
        num1 = s.nextInt();
        System.out.print("Enter number 2: ");
        num2 = s.nextInt();
        System.out.print("Sum of numbers is "+(num1+num2));
    }
}