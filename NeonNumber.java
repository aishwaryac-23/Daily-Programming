import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int square = number * number;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        if (sumOfDigits == number) {
            System.out.println(number + " is a Neon Number.");
        } else {
            System.out.println(number + " is not a Neon Number.");
        }

        scanner.close();
    }
}
/*
Enter a number: 9
9 is a Neon Number.

A Neon Number is a number in which the sum of the digits of the square of the number is equal to the original number itself.
For example, 9 is a neon number because 9^2=81 and 8+1=9.
*/