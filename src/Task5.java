package src;

public class Task5 {
    public static void main(String[] args) {
        int n = 10;

        double startTime = System.nanoTime();
        long result = fibonacci(n);
        double endTime = System.nanoTime();

        System.out.println("Fibonacci(" + n + ") = " + result);
        System.out.println("Time taken: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }

    /*Recursively calculates the n-th Fibonacci number*/
    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
