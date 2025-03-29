package src;

public class Task4 {
    public static void main(String[] args) {
        int n = 5;
        double startTime = System.nanoTime();
        long result = factorial(n);
        double endTime = System.nanoTime();

        System.out.println(n + "! = " + result);
        System.out.println("Time taken: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
    /*calulating factorial with usage of recursion*/
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
