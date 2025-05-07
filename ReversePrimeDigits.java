import java.util.Scanner;

public class ReversePrimeDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        String str = String.valueOf(num);
        char[] chars = str.toCharArray();
        int n = chars.length;

        int[] primes = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            if (isPrimeDigit(ch)) {
                primes[index++] = ch - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            if (isPrimeDigit(chars[i])) {
                chars[i] = (char)(primes[--index] + '0');
            }
        }

        System.out.println(new String(chars));
    }

    static boolean isPrimeDigit(char ch) {
        return ch == '2' || ch == '3' || ch == '5' || ch == '7';
    }
}
