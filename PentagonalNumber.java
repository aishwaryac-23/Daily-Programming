import java.util.Scanner;

public class PentagonalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPentagonal(num)) {
            System.out.println(num + " is a Pentagonal Number.");
        } else {
            System.out.println(num + " is not a Pentagonal Number.");
        }
    }

    static boolean isPentagonal(int num) {
        double n = (1 + Math.sqrt(24 * num + 1)) / 6;
        return n == (int) n;
    }
}
