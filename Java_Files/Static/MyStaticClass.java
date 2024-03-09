public class MyStaticClass {
    private static int count = 0;

    // Static method to get the current count value
    public static int getCount() {
        return count;
    }

    // Static method to increment the count value
    public static void incrementCount() {
        count++;
    }

    // Static method to reset the count value to 0
    public static void resetCount() {
        count = 0;
    }

    public static void main(String[] args) {
        // Accessing the static methods
        System.out.println("Initial Count: " + MyStaticClass.getCount());

        MyStaticClass.incrementCount();
        MyStaticClass.incrementCount();
        MyStaticClass.incrementCount();

        System.out.println("Updated Count: " + MyStaticClass.getCount());

        MyStaticClass.resetCount();

        System.out.println("Reset Count: " + MyStaticClass.getCount());
    }
}
