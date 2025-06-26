import java.util.Scanner;

public class PowerFunction {
    public static int power(int base, int exponent) {
        if (exponent == 0)
            return 1;
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();

        int result = power(base, exponent);
        System.out.println("Result: " + result);
    }
}
