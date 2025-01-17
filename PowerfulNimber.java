import java.util.Scanner;

public class PowerfulNumber {
    public static boolean isPowerful(int number) {
        if (number <= 0) return false;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0 && number % (i * i) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPowerful(number)) {
            System.out.println(number + " is a powerful number.");
        } else {
            System.out.println(number + " is not a powerful number.");
        }
    }
}
