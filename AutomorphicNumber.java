import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isAutomorphic(number)) {
            System.out.println(number + " is an Automorphic number.");
        } else {
            System.out.println(number + " is not an Automorphic number.");
        }
        
        scanner.close();
    }

    public static boolean isAutomorphic(int number) {
        int square = number * number;
        while (number > 0) {
            if (number % 10 != square % 10) {
                return false;
            }
            number /= 10;
            square /= 10;
        }
        return true;
    }
}
