import java.util.Scanner;

public class GiugaNumber {
    static boolean isGiuga(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) sum += i;
        }
        return sum % n == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isGiuga(num) ? "Giuga Number" : "Not a Giuga Number");
        sc.close();
    }
}
