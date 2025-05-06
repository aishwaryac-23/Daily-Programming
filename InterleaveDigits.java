import java.util.Scanner;

public class InterleaveDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.next();
        String num2 = scanner.next();
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while (i < num1.length() || j < num2.length()) {
            if (i < num1.length()) result.append(num1.charAt(i++));
            if (j < num2.length()) result.append(num2.charAt(j++));
        }
        System.out.println(result.toString());
    }
}
