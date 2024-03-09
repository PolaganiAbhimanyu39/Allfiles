class FixedSlidingWindow {
    public static void main(String[] arg) {
        int[] arr = {-2, 5, -1, 7, -3, 1, -6, 4, -8, 3};
        int window_size = 3, i = 1, flag = 0;

        for (int j = 0; j < arr.length; j++) {
            if (j < window_size) {
                if (arr[j] < 0 && flag != 1) {
                    System.out.println(arr[j]);
                    flag = 1;
                }
            } else {
                if (arr[j - window_size] < 0) {
                    flag = 0;  // Reset the flag when the negative number exits the window
                }

                if (arr[j] < 0 && flag != 1) {
                    System.out.println(arr[j]);
                    flag = 1;
                }
            }
        }
    }
}