import java.util.HashMap;
public class Variable4_SlidingWindow
{
 public static void main(String[] aeg)
 {
    HashMap<Character,Integer> hm = new HashMap<>();
    String s = "timetopractice";
    String pattern = "toc";
    int size = pattern.length(),i=0,count=0,ans=s.length();
    for(int j = 0;j<size;j++)
    {
        if(hm.containsKey(pattern.charAt(j))) 
        {
            int val = hm.get(pattern.charAt(j));
            hm.put(pattern.charAt(j), val+1);
        }
        else
        {
            hm.put(pattern.charAt(j), 1);
        }
    }

    count = hm.size();
    for(int j = 0;j<s.length();j++)
    {
        if(hm.containsKey(s.charAt(j)))
        {
            int val = hm.get(s.charAt(j));
            hm.put(s.charAt(j), val-1);
            if(hm.get(s.charAt(j))==0) count--;
        }
            if(count==0)
            {
               while(count==0)
                {
                    ans=Math.min(ans, ((j-i)+1));System.out.println(j+" "+i);
                    if(hm.containsKey(s.charAt(i)))
                    {
                hm.put(s.charAt(i),1);
                count++;
                    }
                    i++;
                }
            }
    }
    System.out.println(ans);
 }   
}