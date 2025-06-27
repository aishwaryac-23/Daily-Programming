import java.util.Scanner;

public class BoundaryTraversal {
    public static void printBoundary(int[][] mat, int rows, int cols) {
        if (rows == 1) {
            for (int i = 0; i < cols; i++)
                System.out.print(mat[0][i] + " ");
        } else if (cols == 1) {
            for (int i = 0; i < rows; i++)
                System.out.print(mat[i][0] + " ");
        } else {
            for (int i = 0; i < cols; i++) // Top row
                System.out.print(mat[0][i] + " ");
            for (int i = 1; i < rows; i++) // Right column
                System.out.print(mat[i][cols - 1] + " ");
            for (int i = cols - 2; i >= 0; i--) // Bottom row
                System.out.print(mat[rows - 1][i] + " ");
            for (int i = rows - 2; i >= 1; i--) // Left column
                System.out.print(mat[i][0] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = sc.nextInt();

        printBoundary(mat, rows, cols);
    }
}
