import java.util.Scanner;

public class DigitLesserThanNeighbors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scanner.next();
        scanner.close();

        int count = 0;

        for (int i = 1; i < num.length() - 1; i++) {
            int prev = num.charAt(i - 1) - '0';
            int curr = num.charAt(i) - '0';
            int next = num.charAt(i + 1) - '0';

            if (curr < prev && curr < next) {
                count++;
            }
        }

        System.out.println("Digits lesser than their neighbors: " + count);
    }
}
