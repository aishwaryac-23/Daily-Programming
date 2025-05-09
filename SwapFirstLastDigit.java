import java.util.Scanner;

public class SwapFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int digits = (int)Math.log10(num);
        int first = num / (int)Math.pow(10, digits);
        int last = num % 10;

        if (digits == 0) {
            System.out.println(num);
            return;
        }

        int middle = (num % (int)Math.pow(10, digits)) / 10;
        int result = last * (int)Math.pow(10, digits) + middle * 10 + first;

        System.out.println(result);
    }
}
