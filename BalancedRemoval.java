import java.util.Scanner;
public class BalancedRemoval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        int[] prefixEven = new int[n];
        int[] prefixOdd = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                prefixEven[i] = weights[i];
                prefixOdd[i] = 0;
            } else {
                prefixEven[i] = prefixEven[i - 1];
                prefixOdd[i] = prefixOdd[i - 1];
                if (i % 2 == 0) {
                    prefixEven[i] += weights[i];
                } else {
                    prefixOdd[i] += weights[i];
                }
            }
        }

        int totalEvenSum = prefixEven[n - 1];
        int totalOddSum = prefixOdd[n - 1];

        int countWays = 0;

        for (int i = 0; i < n; i++) {
            int newEvenSum = totalEvenSum - prefixEven[i] + (i > 0 ? prefixOdd[i - 1] : 0);
            int newOddSum = totalOddSum - prefixOdd[i] + (i > 0 ? prefixEven[i - 1] : 0);

            if (newEvenSum == newOddSum) {
                countWays++;
            }
        }

        System.out.println(countWays);

        sc.close();
    }
}
/*
5
2 2 2 2 2
5

5
6 1 7 2 1
1
 */
