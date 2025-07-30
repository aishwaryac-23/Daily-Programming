import java.util.Scanner;

public class DuodecimalToDecimal {
    public static int convertToDecimal(String duodecimal) {
        int decimal = 0, power = 0;

        for (int i = duodecimal.length() - 1; i >= 0; i--) {
            char ch = duodecimal.charAt(i);
            int value;

            if (ch >= '0' && ch <= '9')
                value = ch - '0';
            else if (ch == 'A')
                value = 10;
            else if (ch == 'B')
                value = 11;
            else
                return -1;  // Invalid input

            decimal += value * Math.pow(12, power);
            power++;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a duodecimal number: ");
        String duodecimal = scanner.next();
        
        int decimal = convertToDecimal(duodecimal);
        if (decimal == -1)
            System.out.println("Invalid input!");
        else
            System.out.println("Decimal: " + decimal);

        scanner.close();
    }
}
