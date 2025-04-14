import java.util.Scanner;

public class CubeEachDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        String result = "";
        int n = num;

        while (n > 0) {
            int digit = n % 10;
            int cube = digit * digit * digit;
            result = cube + result;
            n /= 10;
        }

        System.out.println("Number after replacing each digit with its cube: " + result);
        scanner.close();
    }
}
