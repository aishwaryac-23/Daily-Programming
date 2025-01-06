import java.util.Scanner;

public class NivenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sumOfDigits = 0;

        while (number > 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }

        if (originalNumber % sumOfDigits == 0) {
            System.out.println(originalNumber + " is a Niven number.");
        } else {
            System.out.println(originalNumber + " is not a Niven number.");
        }

        scanner.close();
    }
}
