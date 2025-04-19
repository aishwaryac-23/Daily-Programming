import java.util.Scanner;

public class DigitFactorialReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scanner.next();
        scanner.close();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            result.append(factorial(digit));
        }

        System.out.println("Number after replacing digits with their factorial: " + result);
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
