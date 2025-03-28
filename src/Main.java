package src;

public class Main{
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 1};
       /*calculating time complexity*/
        double startTime = System.nanoTime();
        double avgValue = findAverage(array);
        double endTime = System.nanoTime();

        System.out.println("Average value: " + avgValue);
        System.out.println("Time taken: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }

    /* Calculates the average of elements in an array.*/
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}
