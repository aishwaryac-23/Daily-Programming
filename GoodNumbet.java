import java.util.Scanner;

public class GoodNumber {
    public static boolean isGoodNumber(int n) {
        int sum = 0, product = 1, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return n % sum == 0 && n % product == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isGoodNumber(n) ? "Good Number" : "Not a Good Number");
        sc.close();
    }
}
