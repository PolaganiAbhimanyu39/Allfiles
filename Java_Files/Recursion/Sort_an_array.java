import java.util.ArrayList;
public class Sort_an_array 
{
 public static void main(String[] args)
 {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(7);
    list.add(3);
    list.add(8);
    list.add(9);
    list.add(10);
    list.add(4);
    System.out.println(sort(list));
 }
 static ArrayList<Integer> sort(ArrayList<Integer> list) {
    if (list.size() <= 1)
        return list;

    int n = list.size();
    int element = list.remove(n - 1);
    list = sort(list); // Assigning the result of sort(list) to list

    for (int i = 0; i < n - 1; i++) {
        if (list.get(i) > element) {
            list.add(i, element);
            return list;
        }
    }

    list.add(element);
    return list;
}

 }