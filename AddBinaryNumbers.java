import java.util.Scanner;

public class AddBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin1 = sc.next();
        String bin2 = sc.next();
        
        sc.close();

        StringBuilder result = new StringBuilder();
        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int bit1 = (i >= 0) ? bin1.charAt(i--) - '0' : 0;
            int bit2 = (j >= 0) ? bin2.charAt(j--) - '0' : 0;
            int sum = bit1 + bit2 + carry;

            result.append(sum % 2);
            carry = sum / 2;
        }

        System.out.println("Sum: " + result.reverse().toString());
    }
}
