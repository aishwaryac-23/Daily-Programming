import java.util.Scanner;

public class PandigitalNumber {
    public static boolean isPandigital(long num) {
        if (num < 1023456789L) return false;
        int digits = 0, count = 0;
        while (num > 0) {
            int digit = (int) (num % 10);
            int mask = 1 << digit;
            if ((digits & mask) != 0) return false;
            digits |= mask;
            num /= 10;
            count++;
        }
        return digits == 0b1111111111 && count == 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        System.out.println(isPandigital(num) ? "Pandigital" : "Not Pandigital");
        scanner.close();
    }
}
