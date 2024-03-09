public class Print_n_to_1 
{
        public static void main(String[] args)
            {
                print_n_to_1(10);
            }
            static void print_n_to_1(int n)
            {
                if(n==1) System.out.println(n);
                else
                {
                    System.out.println(n);
                    print_n_to_1(n-1);
                }
            }
        }         