import java.util.*;
public class Variable2_SlidingWindow 
{
 public static void main(String[] arg)
 {
    String s = "abaccab";
    HashMap<Character,Integer> hm = new HashMap<>();
    int k = 2,j=0,count=0,val;
    for(int i = 0;i<s.length();i++)
    {
        if(!hm.containsKey(s.charAt(i)))
        hm.put(s.charAt(i), 1);
        else 
        {
            hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
        }
        if(hm.size()>k)
        {
            while(hm.size()>k)
            {
                val=hm.get(s.charAt(j));
                if(val==1)
                hm.remove(s.charAt(j));
                else
                {
                    hm.put(s.charAt(j), hm.get(s.charAt(j))-1);
                }
                j++;
            }
        }
        if(hm.size()<k) continue;
        else if(hm.size()==k)
        {
            count = Math.max(count, (i-j)+1);
        }
    }
System.out.println(count);    
 }   
}