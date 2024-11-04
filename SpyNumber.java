import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isSpyNumber(number)) {
            System.out.println(number + " is a Spy Number.");
        } else {
            System.out.println(number + " is not a Spy Number.");
        }

        scanner.close();
    }

    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += digit;            // Add digit to sum
            product *= digit;        // Multiply digit to product
            number /= 10;            // Remove last digit
        }

        return sum == product; // Check if sum equals product
    }
}
/*
Enter a number: 456
456 is not a Spy Number.

Enter a number: 123
123 is a Spy Number.
 */