public class JumpingNumber {
    public static boolean isJumpingNumber(int n) {
        int prevDigit = n % 10;
        n /= 10;

        while (n > 0) {
            int currentDigit = n % 10;
            if (Math.abs(currentDigit - prevDigit) != 1) {
                return false;
            }
            prevDigit = currentDigit;
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 123;
        if (isJumpingNumber(number)) {
            System.out.println(number + " is a Jumping Number.");
        } else {
            System.out.println(number + " is not a Jumping Number.");
        }
    }
}
