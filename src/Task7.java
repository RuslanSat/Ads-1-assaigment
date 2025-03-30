package src;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of elements
        reversePrint(n, scanner);
        scanner.close();
    }

    /* Reads and prints numbers in reverse order using recursion.*/
    public static void reversePrint(int n, Scanner scanner) {
        if (n == 0) return; // Base case
        int num = scanner.nextInt();
        reversePrint(n - 1, scanner);
        System.out.print(num + " ");
    }
}
