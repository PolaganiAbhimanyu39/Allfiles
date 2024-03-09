class Rough2
{
    public static void main(String[] args)
    {
        int res = height(10);
        System.out.println(res);
    }
    static int height(int n)
    {
        if(n==1) return 1;
        else
        {
            return 1+height(n/2);
        }
    }
}