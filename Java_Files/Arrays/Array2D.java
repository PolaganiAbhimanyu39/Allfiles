public class Array2D {
    public static void main(String[] args) {
        int myarr[][] = new int[3][4];
        int i, j;
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                myarr[i][j] = (i * i) + (j * j);
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(myarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
