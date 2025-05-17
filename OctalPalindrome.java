import java.util.Scanner;

public class OctalPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        String octal = Integer.toOctalString(num);
        String reverse = new StringBuilder(octal).reverse().toString();

        if (octal.equals(reverse)) {
            System.out.println("Palindrome in octal");
        } else {
            System.out.println("Not a palindrome in octal");
        }
    }
}
