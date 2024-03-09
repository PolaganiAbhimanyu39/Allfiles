import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
class DP_Fibo
{
    public static void main(String[] args)
    {
        HashMap<Integer,Integer> mymap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find fibonacii: ");
        int n = sc.nextInt();
        int res = fibo(mymap,n);
        System.out.println("Fibonacii number is "+res);
    }
    public static int fibo(HashMap<Integer,Integer> map,int n)
    {
        int value;
    if(map.containsKey(n)) return(map.get(n));
    else if(n==1 || n==0)
    {
        map.put(n,n);
        return n;
    }
    else
    {
           value = fibo(map,n-1)+fibo(map,n-2);
           map.put(n,value);
           return value;
    }
    }

}