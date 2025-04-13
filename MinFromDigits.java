import java.util.Arrays;
import java.util.Scanner;

public class MinFromDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        char[] digits = input.toCharArray();
        Arrays.sort(digits);

        if (digits[0] == '0') {
            for (int i = 1; i < digits.length; i++) {
                if (digits[i] != '0') {
                    char temp = digits[0];
                    digits[0] = digits[i];
                    digits[i] = temp;
                    break;
                }
            }
        }

        System.out.print("Minimum number from digits: ");
        for (char digit : digits) {
            System.out.print(digit);
        }

        scanner.close();
    }
}
