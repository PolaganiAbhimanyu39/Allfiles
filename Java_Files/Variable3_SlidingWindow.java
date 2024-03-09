import java.util.*;
public class Variable3_SlidingWindow 
{
 public static void main(String[] arg)
 {
    String s = "tmmzuxt";
    HashMap<Character,Integer> hm = new HashMap<>();
    int j=0,count=0;
    for(int i = 0;i<s.length();i++)
    {
        if(!hm.containsKey(s.charAt(i)))
        {
            hm.put(s.charAt(i), 1);
            count=Math.max(count,((i-j)+1));
        }
        else 
        {
            while(s.charAt(j)!=s.charAt(i))
            {
                hm.remove(s.charAt(j));
                j++;
            }
            if(s.charAt(j)==s.charAt(i)) j++;
        }
    }
System.out.println(count);    
 }   
}