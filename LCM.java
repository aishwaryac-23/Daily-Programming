import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = num1, lcm;
        int a = num1, b = num2;

        while (b != 0) {
            int temp = b;
            b = gcd % b;
            gcd = temp;
        }

        lcm = (a * b) / gcd;
        System.out.println("LCM: " + lcm);
    }
}
