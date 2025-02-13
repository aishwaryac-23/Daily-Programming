import java.util.Scanner;

public class NonagonalNumber {
    public static int getNonagonalNumber(int n) {
        return n * (7 * n - 5) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getNonagonalNumber(n));
        scanner.close();
    }
}
