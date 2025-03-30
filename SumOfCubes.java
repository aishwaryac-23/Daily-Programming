import java.util.Scanner;

public class SumOfCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * i * i);
        }
        
        System.out.println("Sum of cubes of first " + n + " natural numbers: " + sum);
        scanner.close();
    }
}
