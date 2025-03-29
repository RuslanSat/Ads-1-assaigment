package src;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 1, 32, 3, 45};
        /*calculating time complexity*/
        double startTime = System.nanoTime();
        int minValue = findMin(array);
        double endTime = System.nanoTime();

        System.out.println("Minimum value: " + minValue);
        System.out.println("Time taken: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }

    /* function to calculate min element in array. */
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
