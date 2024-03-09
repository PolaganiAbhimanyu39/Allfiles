import java.util.*;
public class FixedSlidingWindow2 
{
    public static void main(String[] arg)
    {
    ArrayList<Integer> al = new ArrayList<>();
    int[] arr = {12,-1,-7,8,-15,30,16,28};
    int k=3,i=0;
    for(int j = 0;j<arr.length;j++)
    {
        if(arr[j]<0) al.add(arr[j]);
        if(j-i+1<k) continue;
        else if(j-i+1==k)
        {
            if(al.isEmpty()) System.out.println(0);
            else
            {
                System.out.println(al.get(0));
                if(al.get(0)==arr[i]) al.remove(0);
            }
            i++;
        }
    }
    }
}
