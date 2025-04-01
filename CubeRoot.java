import java.util.Scanner;

public class CubeRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        
        double guess = num / 3;
        double epsilon = 0.0001;
        
        while (Math.abs(guess * guess * guess - num) > epsilon) {
            guess = (2 * guess + num / (guess * guess)) / 3;
        }

        System.out.println("Cube root: " + guess);
        scanner.close();
    }
}
