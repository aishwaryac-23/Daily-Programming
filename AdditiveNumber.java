public class AdditiveNumber {

    public static boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; Math.max(i, j) <= n - i - j; j++) {
                if (isValid(num, i, j)) return true;
            }
        }
        return false;
    }

    private static boolean isValid(String num, int len1, int len2) {
        if (num.charAt(0) == '0' && len1 > 1) return false;
        if (num.charAt(len1) == '0' && len2 > 1) return false;
        String num1 = num.substring(0, len1);
        String num2 = num.substring(len1, len1 + len2);
        String remaining = num.substring(len1 + len2);
        while (!remaining.isEmpty()) {
            String sum = addStrings(num1, num2);
            if (!remaining.startsWith(sum)) return false;
            num1 = num2;
            num2 = sum;
            remaining = remaining.substring(sum.length());
        }
        return true;
    }

    private static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += num1.charAt(i--) - '0';
            if (j >= 0) sum += num2.charAt(j--) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(isAdditiveNumber("112358")); // true
        System.out.println(isAdditiveNumber("199100199")); // true
        System.out.println(isAdditiveNumber("123")); // true
        System.out.println(isAdditiveNumber("1023")); // false
    }
}
