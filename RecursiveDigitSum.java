import java.util.Scanner;

public class RecursiveDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        System.out.println(addDigits(number));
    }

    static int addDigits(int n) {
        if (n < 10)
            return n;

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return addDigits(sum);
    }
}
