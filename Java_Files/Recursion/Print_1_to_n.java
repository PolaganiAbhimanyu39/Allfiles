public class Print_1_to_n 
{
    public static void main(String[] args)
        {
            print_1_to_n(10);
        }
        static void print_1_to_n(int n)
        {
            if(n==1) System.out.println(n);
            else
            {
                print_1_to_n(n-1);
                System.out.println(n);
            }
        }
    }      