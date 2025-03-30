package src;

public class Task8 {
    public static void main(String[] args) {
        String s = "123ab456";

        double startTime = System.nanoTime();
        boolean result = isNumeric(s);
        double endTime = System.nanoTime();

        System.out.println(result);
        System.out.println("Time taken: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }

    /* Checks if a string consists only of digits.*/
    public static boolean isNumeric(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
