import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = n * (n + 1) / 2;
            System.out.println("The sum of natural numbers up to " + n + " is: " + sum);
        }

        scanner.close();
    }
}
