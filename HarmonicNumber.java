import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            double harmonicNumber = 0.0;
            for (int i = 1; i <= n; i++) {
                harmonicNumber += 1.0 / i;
            }
            System.out.printf("The %dth harmonic number is: %.6f%n", n, harmonicNumber);
        }
        scanner.close();
    }
}
