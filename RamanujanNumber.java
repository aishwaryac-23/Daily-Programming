import java.util.Scanner;

public class RamanujanNumber {
    // Function to check if a number is a Ramanujan number
    public static boolean isRamanujan(int number) {
        int count = 0;

        // Iterate over all possible pairs (a, b) such that a^3 + b^3 = number
        for (int a = 1; a * a * a < number; a++) {
            for (int b = a; a * a * a + b * b * b <= number; b++) {
                if (a * a * a + b * b * b == number) {
                    count++;
                    System.out.println(number + " = " + a + "^3 + " + b + "^3");
                }
            }
        }
        // Ramanujan number must have exactly 2 such pairs
        return count == 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int number = scanner.nextInt();

        if (isRamanujan(number)) {
            System.out.println(number + " is a Ramanujan number.");
        } else {
            System.out.println(number + " is not a Ramanujan number.");
        }

        scanner.close();
    }
}
