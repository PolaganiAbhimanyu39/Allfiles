class Unequal2DArray{
    public static void main(String args[]){
        int D2Arr[][] = new int[7][];
        D2Arr[0]= new int[1];
        D2Arr[1]= new int[2];
        D2Arr[2]= new int[3];
        D2Arr[3]= new int[4];
        D2Arr[4]= new int[5];
        D2Arr[5]= new int[6];
        D2Arr[6]= new int[7];
        for(int i = 0;i<7;i++){
            for(int j = 0;j<=i;j++){
                D2Arr[i][j] = i+j+7;
            }
        }
        for(int i = 0;i<7;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(D2Arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}