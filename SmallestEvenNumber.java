import java.util.Arrays;
import java.util.Scanner;

public class SmallestEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        sc.close();

        char[] digits = num.toCharArray();
        Arrays.sort(digits);

        int lastEvenIndex = -1;

        for (int i = 0; i < digits.length; i++) {
            if ((digits[i] - '0') % 2 == 0) {
                lastEvenIndex = i;
            }
        }

        if (lastEvenIndex == -1) {
            System.out.println("Not possible");
            return;
        }

        char evenDigit = digits[lastEvenIndex];
        for (int i = lastEvenIndex; i < digits.length - 1; i++) {
            digits[i] = digits[i + 1];
        }

        digits[digits.length - 1] = evenDigit;

        System.out.println(new String(digits));
    }
}
