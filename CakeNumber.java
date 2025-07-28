import java.util.Scanner;

public class CakeNumber {
    public static int cakeNumber(int n) {
        return (n * (n + 1)) / 2 + 1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(cakeNumber(n));
    }
}
