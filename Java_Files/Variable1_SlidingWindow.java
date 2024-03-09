class Rough
{
    public static void main(String[] arg)
    {
        int[] arr = {4,1,1,1,2,5};
        int k=5,j=0,sum=0,count=0;
        for(int i = 0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum>k)
            {
                while(sum>k)
                {
                    sum-=arr[j];
                    j++;
                }
            }
            if(sum==k) 
            {
                count=Math.max(count, (i-j)+1);
            }
            else if(sum<k) continue;
        }
        System.out.println(count);
    }
}