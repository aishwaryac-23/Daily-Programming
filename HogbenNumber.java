import java.util.Scanner;

public class HogbenNumber {
    public static boolean isHogben(int n) {
        int triangular = 0, i = 1;
        while (triangular < n) {
            triangular += i;
            if (triangular == n) return true;
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(isHogben(n) ? "Hogben Number" : "Not a Hogben Number");
    }
}
