import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        sc.close();

        int product = 1;

        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            product *= digit;
        }

        System.out.println(product);
    }
}
