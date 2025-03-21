public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int decimal = 255;
        System.out.println("Hexadecimal representation: " + decimalToHex(decimal));
    }

    public static String decimalToHex(int decimal) {
        StringBuilder hex = new StringBuilder();
        char[] hexChars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            hex.insert(0, hexChars[decimal % 16]);
            decimal /= 16;
        }
        return hex.toString();
    }
}
