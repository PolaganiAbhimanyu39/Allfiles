public class Array {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};
        int i, sum = 0;
        float avg;
        for (i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        avg=sum/arr.length;
            System.out.print(avg);
    }
}

