import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * i);
        }
        
        System.out.println("Sum of squares of first " + n + " natural numbers: " + sum);
        scanner.close();
    }
}
