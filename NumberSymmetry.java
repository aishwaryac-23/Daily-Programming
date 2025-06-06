import java.util.Scanner;

public class NumberSymmetry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        if (original == reverse)
            System.out.println("Symmetric");
        else
            System.out.println("Not Symmetric");
    }
}
