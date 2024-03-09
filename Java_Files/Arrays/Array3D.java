public class Array3D{
    public static void main(String[] args){
        int myarr[][][]=new int[3][4][5];
        int i,j,k;
        for(k=0;k<5;k++){
            for(i=0;i<3;i++){
                for(j=0;j<4;j++){
                    myarr[i][j][k]=i+j+k;
                }
            }
        }
                for(k=0;k<5;k++){
            for(i=0;i<3;i++){
                for(j=0;j<4;j++){
                    System.out.print(myarr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }



