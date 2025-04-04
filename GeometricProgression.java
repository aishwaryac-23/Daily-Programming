import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first term (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter common ratio (r): ");
        int r = scanner.nextInt();
        System.out.print("Enter number of terms (n): ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a *= r;
        }
        
        scanner.close();
    }
}
