public class EqualityPrinter {

    public static void main(String[] args) {
        printEqual(-1, 1, 1);
        System.out.println();
        printEqual(1, 2, 3);
        System.out.println();
        printEqual(1, 1, 2);
        System.out.println();
        printEqual(1, 1, 1);

        // || is or while && is and
    }

    private static void printEqual(int a, int b, int c) {
        if ((a < 0) || (b < 0) || (c < 0)) {
            System.out.println("Invalid Number");
        } else if ((a == b) && (a == c) && (b == c)) {
            System.out.println("All numbers are equal");

        } else if ((a != b) && (a != c) && (b != c)) {
            System.out.println("All numbers are different");

        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
