public class DecimalToDuodecimal {
    public static String decimalToDuodecimal(int number) {
        if (number == 0) return "0";
        StringBuilder duodecimal = new StringBuilder();
        char[] digits = "0123456789AB".toCharArray();
        while (number > 0) {
            duodecimal.append(digits[number % 12]);
            number /= 12;
        }
        return duodecimal.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(decimalToDuodecimal(145));
    }
}
