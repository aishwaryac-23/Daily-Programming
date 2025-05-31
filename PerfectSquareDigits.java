import java.util.Scanner;

public class PerfectSquareDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        int count = 0;

        while (number > 0) {
            int digit = number % 10;
            if (isPerfectSquareDigit(digit)) {
                count++;
            }
            number /= 10;
        }

        System.out.println(count);
    }

    static boolean isPerfectSquareDigit(int d) {
        return d == 0 || d == 1 || d == 4 || d == 9;
    }
}
