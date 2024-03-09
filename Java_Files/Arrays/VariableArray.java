public class VariableArray{
    public static void main(String[] args) {
        int arr[][] = new int[4][];
        int i,j;
        for (i = 0; i < 4; i++) {
            arr[i] = new int[i+5];
        } 
             for(i=0;i<4;i++){
            for(j=0;j<arr[i].length;j++){
                arr[i][j]=(2*i)+5;
            }
        }
        for(i=0;i<4;i++){
            for(j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

