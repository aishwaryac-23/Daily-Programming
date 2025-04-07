import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0, prev = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr = value(s.charAt(i));
            if (curr < prev) {
                result -= curr;
            } else {
                result += curr;
            }
            prev = curr;
        }
        return result;
    }

    public static int value(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine().toUpperCase();
        int result = romanToInt(roman);
        System.out.println("Integer value: " + result);
        scanner.close();
    }
}
