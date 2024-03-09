public class D3Array {
    public static void main(String args[]){
        int D3Array[][][] = new int[4][4][4];
        for(int i = 0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    D3Array[i][j][k]=i+j+k;
                }
            }
        }
                for(int i = 0;i<4;i++){
            for(int j=0;j<4;j++){
                for(int k=0;k<4;k++){
                    System.out.print(D3Array[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
        
    }
}
