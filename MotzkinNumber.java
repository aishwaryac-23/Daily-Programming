import java.util.Scanner;

public class MotzkinNumber {
    static int motzkin(int n) {
        if (n == 0 || n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = ((2 * i + 1) * dp[i - 1] + (3 * i - 3) * dp[i - 2]) / (i + 2);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(motzkin(n));
        sc.close();
    }
}
