import java.util.Scanner;

public class PracticalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        boolean isPractical = true;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                int sum = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) sum += j;
                }
                if (sum < i) {
                    isPractical = false;
                    break;
                }
            }
        }
        System.out.println(n + (isPractical ? " is a practical number." : " is not a practical number."));
    }
}
