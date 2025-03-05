public class SteppingNumber {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(isSteppingNumber(num));
    }

    public static boolean isSteppingNumber(int n) {
        int prevDigit = -1;
        while (n > 0) {
            int currDigit = n % 10;
            if (prevDigit != -1 && Math.abs(prevDigit - currDigit) != 1) {
                return false;
            }
            prevDigit = currDigit;
            n /= 10;
        }
        return true;
    }
}
