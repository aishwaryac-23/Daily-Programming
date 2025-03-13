import java.util.Scanner;

public class ExtravagantNumber {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static String primeFactorization(int n) {
        StringBuilder factors = new StringBuilder();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                factors.append(i);
                n /= i;
            }
        }
        if (n > 1) factors.append(n);
        return factors.toString();
    }

    public static boolean isExtravagant(int n) {
        return primeFactorization(n).length() > countDigits(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isExtravagant(n) ? "Extravagant Number" : "Not an Extravagant Number");
        sc.close();
    }
}
