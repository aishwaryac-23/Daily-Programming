import java.util.Scanner;

public class StarNumber {
    // Function to calculate the nth Star Number
    public static int calculateStarNumber(int n) {
        return 6 * n * (n - 1) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of star numbers to calculate
        System.out.print("Enter the number of Star Numbers to display: ");
        int count = scanner.nextInt();

        System.out.println("The first " + count + " Star Numbers are:");
        for (int i = 1; i <= count; i++) {
            System.out.println("Star Number " + i + ": " + calculateStarNumber(i));
        }

        scanner.close();
    }
}
