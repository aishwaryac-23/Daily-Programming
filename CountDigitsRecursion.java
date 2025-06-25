import java.util.Scanner;

public class CountDigitsRecursion {
    public static int countDigits(int n) {
        if (n == 0)
            return 0;
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number == 0)
            System.out.println("Digits: 1");
        else
            System.out.println("Digits: " + countDigits(Math.abs(number)));
    }
}
