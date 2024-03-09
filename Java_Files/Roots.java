
import java.util.Scanner;
public class Roots {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a ;
        Stack st = new Stack();
        char[] equation = new char[20];
        String eqn;
        int j=0;
        System.out.print("Enter equation: ");
        eqn = sc.next();
        equation=eqn.toCharArray();
        System.out.println(equation);
        for(int i=0;i<equation.length;i++){
            if(equation[i]=='x' && equation[i+1]=='^' && equation[i+2]=='2'){
                while(equation[j]!=equation[i]){
                    a+=Character.toString(equation[j]);
                    j++;
                }
                System.out.println(a);
            }
            else if(equation[i]=='x'){

            }
        }
    }
}
