import java.util.Scanner;
public class SelectionSort {
    static void demo(int[] arr) {
        int min, min_index, len = arr.length, temp;
        for (int i = 0; i < len; i++) {
            min = arr[i];
            min_index = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_index = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
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
        SelectionSort.demo(arr);
        System.out.println("Sorted Array");
        for (int j : arr) {
            System.out.format("%d ", j);
        }
    }
}
