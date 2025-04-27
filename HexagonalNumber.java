import java.util.Scanner;

public class HexagonalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isHexagonal(num)) {
            System.out.println(num + " is a Hexagonal Number.");
        } else {
            System.out.println(num + " is not a Hexagonal Number.");
        }
    }

    static boolean isHexagonal(int num) {
        double n = (1 + Math.sqrt(1 + 8 * num)) / 4;
        return n == (int) n;
    }
}
