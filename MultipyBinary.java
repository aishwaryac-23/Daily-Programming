import java.util.Scanner;

public class MultiplyBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin1 = sc.next();
        String bin2 = sc.next();
        sc.close();

        int num1 = binaryToDecimal(bin1);
        int num2 = binaryToDecimal(bin2);
        int product = num1 * num2;

        System.out.println("Product: " + decimalToBinary(product));
    }

    static int binaryToDecimal(String binary) {
        int result = 0, base = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                result += base;
            }
            base *= 2;
        }
        return result;
    }

    static String decimalToBinary(int num) {
        StringBuilder binary = new StringBuilder();
        if (num == 0) return "0";
        while (num > 0) {
            binary.insert(0, num % 2);
            num /= 2;
        }
        return binary.toString();
    }
}
