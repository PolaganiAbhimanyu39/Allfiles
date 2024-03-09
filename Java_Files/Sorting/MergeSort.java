import java.util.Scanner;

public class MergeSort {
    static merge()
    {

    }
    static int[] demo(int left,int right, int[] arr)
    {
        int[] L,R;
        if (right-left<=1) return arr;
        else {
            L = new int[]
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
        sorted = MergeSort.demo(arr,0,size);
        System.out.println("Sorted Array");
        for (int j : sorted) {
            System.out.format("%d ", j);
        }
    }
}
