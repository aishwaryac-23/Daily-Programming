import java.util.Scanner;

public class SociableNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int num = scanner.nextInt();
        System.out.print("Enter chain length: ");
        int length = scanner.nextInt();
        scanner.close();

        if (isSociable(num, length)) {
            System.out.println(num + " is a Sociable Number of chain length " + length + ".");
        } else {
            System.out.println(num + " is not a Sociable Number of chain length " + length + ".");
        }
    }

    static boolean isSociable(int num, int chainLength) {
        int original = num;
        for (int i = 0; i < chainLength; i++) {
            num = sumOfProperDivisors(num);
            if (num == 0)
                return false;
        }
        return num == original;
    }

    static int sumOfProperDivisors(int n) {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i == n / i)
                    sum += i;
                else
                    sum += i + n / i;
            }
        }
        return (n == 1) ? 0 : sum;
    }
}
