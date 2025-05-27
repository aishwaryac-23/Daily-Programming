import java.util.Scanner;

public class RemovePrimeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        int result = 0, place = 1;

        while (number > 0) {
            int digit = number % 10;
            if (!isPrimeDigit(digit)) {
                result += digit * place;
                place *= 10;
            }
            number /= 10;
        }

        System.out.println(result);
    }

    static boolean isPrimeDigit(int d) {
        return d == 2 || d == 3 || d == 5 || d == 7;
    }
}
