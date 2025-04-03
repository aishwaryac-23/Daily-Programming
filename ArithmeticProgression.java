import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first term (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter common difference (d): ");
        int d = scanner.nextInt();
        System.out.print("Enter number of terms (n): ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a += d;
        }
        
        scanner.close();
    }
}
