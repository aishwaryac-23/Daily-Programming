import java.util.Scanner;

public class ZigZagPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= n; col++) {
                if ((row + col) % 4 == 0 || (row == 2 && col % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
