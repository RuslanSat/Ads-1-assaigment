package src;

public class Task3 {
    public static void main(String[] args) {
        int n = 10;
    /*calcultaing time complexit*/
        double startTime = System.nanoTime();
        boolean isPrime = isPrime(n);
        double endTime = System.nanoTime();

        System.out.println(n + " is " + (isPrime ? "Prime" : "Composite"));
        System.out.println("Time taken: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
    /*checking is the n is prime*/
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
