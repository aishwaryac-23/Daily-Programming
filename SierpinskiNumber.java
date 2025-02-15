import java.math.BigInteger;
import java.util.Scanner;

public class SierpinskiNumber {
    public static boolean isSierpinski(int k) {
        for (int n = 1; n <= 100; n++) {
            BigInteger num = BigInteger.valueOf(k).multiply(BigInteger.TWO.pow(n)).add(BigInteger.ONE);
            if (num.isProbablePrime(10)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.close();
        System.out.println(isSierpinski(k));
    }
}
