import java.util.Scanner;

public class NarcissisticNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), temp = num, sum = 0, digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }
        System.out.println(sum == num ? "Yes" : "No");
        scanner.close();
    }
}
