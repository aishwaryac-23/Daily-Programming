import java.util.Arrays;
import java.util.Scanner;

public class MaxFromDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        char[] digits = input.toCharArray();
        Arrays.sort(digits);

        StringBuilder maxNumber = new StringBuilder(new String(digits)).reverse();
        System.out.println("Maximum number from digits: " + maxNumber);

        scanner.close();
    }
}
