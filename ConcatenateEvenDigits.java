import java.util.Scanner;

public class ConcatenateEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int reversed = 0, temp = num;
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }

        int result = 0;
        while (reversed > 0) {
            int digit = reversed % 10;
            if (digit % 2 == 0) {
                result = result * 10 + digit;
            }
            reversed /= 10;
        }

        System.out.println("Number formed by even digits: " + result);
    }
}
