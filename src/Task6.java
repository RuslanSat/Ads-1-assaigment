package src;

public class Task6 {
    public static void main(String[] args) {
        int a = 2, n = 10;

        double startTime = System.nanoTime();
        long result = power(a, n);
        double endTime = System.nanoTime();

        System.out.println(a + "^" + n + " = " + result);
        System.out.println("Time taken: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
/* Recursively calculates a^n.*/
    public static long power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }
}
