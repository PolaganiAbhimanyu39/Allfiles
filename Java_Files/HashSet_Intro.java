import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Intro 
{
    // Remember, that there's no guarantee that you'll get the elements in the order you've inserted when you iterate over them
    public static void main(String[] args)
    {
        // In a HashSet (Insertion, Deletion, Searching) operation takes constant time it's due to hashing
        HashSet<Integer> Set = new HashSet<>();
        // How to add elements into a HashSet
        Set.add(1);
        Set.add(2);
        Set.add(3);
        Set.add(1);
        //Inorder to print all elements in a set
        System.out.println(Set);
        // Observe that even if I've added '1' twice we only see it once coz HashSet stores only unique elements
        // How to delete elements into a HashSet
        Set.remove(1);
        System.out.println(Set);
        // To search element in a set
        if(Set.contains(1))
        {
            System.out.println("Set has 1");
        }
        if(!Set.contains(6))
        {
            System.out.println("Set doesn't have 6");
        }
        //In order to iterate over a set we create an Interator obj which is returned by 'iterator()' method defined in HashSet
        //That's why we've imported Iterator
        Iterator it = Set.iterator();

        //Iterator has two methods
        //1.next() - which returns next element
        //2.hasNext() - which returns a boolean whether there's a next element beyond the current element
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }    
}
