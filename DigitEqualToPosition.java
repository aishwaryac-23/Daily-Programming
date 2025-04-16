import java.util.Scanner;

public class DigitEqualToPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scanner.next();
        scanner.close();

        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            int position = i + 1;
            if (digit == position) {
                count++;
            }
        }

        System.out.println("Digits equal to their position: " + count);
    }
}
