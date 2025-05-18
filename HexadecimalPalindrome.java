import java.util.Scanner;

public class HexadecimalPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        String hex = Integer.toHexString(num).toUpperCase();
        String reverse = new StringBuilder(hex).reverse().toString();

        if (hex.equals(reverse)) {
            System.out.println("Palindrome in hexadecimal");
        } else {
            System.out.println("Not a palindrome in hexadecimal");
        }
    }
}
