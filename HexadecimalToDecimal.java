public class HexadecimalToDecimal {
    public static void main(String[] args) {
        String hex = "FF";
        System.out.println("Decimal representation: " + hexToDecimal(hex));
    }

    public static int hexToDecimal(String hex) {
        int decimal = 0;
        int base = 1;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            int value;
            if (ch >= '0' && ch <= '9') {
                value = ch - '0';
            } else {
                value = ch - 'A' + 10;
            }
            decimal += value * base;
            base *= 16;
        }
        return decimal;
    }
}
