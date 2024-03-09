import java.util.HashMap;
public class CountAnagrams
{
 public static void main(String[] aeg)
 {
    HashMap<Character,Integer> hm = new HashMap<>();
    String s = "orfofrforfrorforof";
    String pattern = "for";
    int size = pattern.length(),i=0,count,ans=0;
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
    count=hm.size();
    for(int j = 0;j<s.length();j++)
    {
        if(hm.containsKey(s.charAt(j)))
        {
            int val = hm.get(s.charAt(j));
            hm.put(s.charAt(j), val-1);
            if(hm.get(s.charAt(j))==0) count--;
        }

        if(j-i+1<size)
        {
            continue;
        }
        else if(j-i+1==size)
        {
            if(count==0) ans++;
            if(hm.containsKey(s.charAt(i)))
            {
                int val = hm.get(s.charAt(i));
                hm.put(s.charAt(i), val+1);
                if(hm.get(s.charAt(i))!=0) count++;
            }
            i++;
        }
    }
    System.out.println(ans);
 }   
}