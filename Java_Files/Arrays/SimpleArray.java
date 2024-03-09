import java.util.Scanner;
class SimpleArray {
    public static void main(String[] args) {
        int[][] D2arr = new int[5][4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter number ");
                D2arr[i][j] = input.nextInt();
            }
            input.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf(D2arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}