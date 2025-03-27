import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();
        
        int result = 1;
        while (exponent > 0) {
            result *= base;
            exponent--;
        }

        System.out.println("Result: " + result);
        scanner.close();
    }
}
