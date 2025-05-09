import java.util.Scanner;

public class LargestSquareMatrix {
    public static int findLargestSquare(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length, maxSize = 0;
        int[][] dp = new int[rows][cols];

        for (int i = 0; i < rows; i++) dp[i][0] = matrix[i][0];
        for (int j = 0; j < cols; j++) dp[0][j] = matrix[0][j];

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                    maxSize = Math.max(maxSize, dp[i][j]);
                }
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = scanner.nextInt();

        System.out.println(findLargestSquare(matrix));
    }
}
