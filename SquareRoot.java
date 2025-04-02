import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        
        double guess = num / 2;
        double epsilon = 0.0001;
        
        while (Math.abs(guess * guess - num) > epsilon) {
            guess = (guess + num / guess) / 2;
        }

        System.out.println("Square root: " + guess);
        scanner.close();
    }
}
