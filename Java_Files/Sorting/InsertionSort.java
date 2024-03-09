import java.util.Scanner;
public class InsertionSort
{
    static void Demo(int[] arr) {
        int pos, temp;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            while (pos > 0 && arr[pos] < arr[pos - 1]) {
                temp = arr[pos];
                arr[pos] = arr[pos - 1];
                arr[pos - 1] = temp;
                pos--;
            }
        }
    }
    public static void main(String[] args)
    {
        int size;
        int[] arr,sorted;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        size = input.nextInt();
        arr = new int[size];
        for(int i = 0;i<size;i++) {
            System.out.format("Enter %d element of array: ", (i + 1));
            arr[i] = input.nextInt();
        }
        System.out.println("Unsorted Array");
        for (int j : arr) {
            System.out.format("%d ", j);
        }
        System.out.println();
        InsertionSort.Demo(arr);
        System.out.println("Sorted Array");
        for (int j : arr) {
            System.out.format("%d ", j);
        }
    }
}
