import java.util.Scanner;

public class MultiplyWithReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int reverse = 0, temp = num;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        int result = num * reverse;
        System.out.println("Result: " + result);
    }
}
