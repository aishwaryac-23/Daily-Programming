import java.util.Scanner;

public class AutomorphicInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower bound: ");
        int start = scanner.nextInt();
        System.out.print("Enter upper bound: ");
        int end = scanner.nextInt();
        scanner.close();

        System.out.println("Automorphic numbers in the range:");
        for (int i = start; i <= end; i++) {
            if (isAutomorphic(i)) {
                System.out.print(i + " ");
            }
        }

    }

    static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }
}
