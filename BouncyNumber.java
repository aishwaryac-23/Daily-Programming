import java.util.Scanner;

public class BouncyNumber {

    public static boolean isBouncy(int number) {
        boolean increasing = false;
        boolean decreasing = false;

        int previousDigit = number % 10;
        number /= 10;

        while (number > 0) {
            int currentDigit = number % 10;
            if (currentDigit < previousDigit) {
                increasing = true;
            } else if (currentDigit > previousDigit) {
                decreasing = true;
            }
            if (increasing && decreasing) {
                return true;
            }
            previousDigit = currentDigit;
            number /= 10;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isBouncy(number)) {
            System.out.println(number + " is a Bouncy Number.");
        } else {
            System.out.println(number + " is not a Bouncy Number.");
        }
    }
}

/*
A Bouncy Number is a positive integer that is neither in increasing nor decreasing order.
In other words, a number is bouncy if its digits do not consistently increase or decrease throughout.

Enter a number: 123
123 is not a Bouncy Number.

 */
