import java.util.Scanner;
public class BubbleSort
{
    static void demo(int[] arr)
    {
        int len = arr.length,temp;
        for(int i = 0;i<len;i++)
        {
            for(int j = 0;j<len-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int size;
        int[] arr, sorted;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size = input.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.format("Enter %d element of array: ", (i + 1));
            arr[i] = input.nextInt();
        }
        System.out.println("Unsorted Array");
        for (int j : arr) {
            System.out.format("%d ", j);
        }
        System.out.println();
        BubbleSort.demo(arr);
        System.out.println("Sorted Array");
        for (int j : arr) {
            System.out.format("%d ", j);
        }
    }
}
