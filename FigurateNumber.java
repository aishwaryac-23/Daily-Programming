import java.util.Scanner;

public class FigurateNumber {
    static int triangular(int n) {
        return n * (n + 1) / 2;
    }

    static int square(int n) {
        return n * n;
    }

    static int pentagonal(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Triangular: " + triangular(n));
        System.out.println("Square: " + square(n));
        System.out.println("Pentagonal: " + pentagonal(n));
        sc.close();
    }
}
