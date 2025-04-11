import java.util.Scanner;

public class SpecialTwoDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int num = scanner.nextInt();

        int d1 = num / 10;
        int d2 = num % 10;

        int sum = d1 + d2;
        int product = d1 * d2;

        if (sum + product == num) {
            System.out.println(num + " is a special two-digit number.");
        } else {
            System.out.println(num + " is not a special two-digit number.");
        }

        scanner.close();
    }
}
