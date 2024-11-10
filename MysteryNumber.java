public class MysteryNumber {

    public static int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    public static boolean isMysteryNumber(int n) {
        for (int i = 1; i <= n / 2; i++) {
            int reverseI = reverse(i);
            if (i + reverseI == n) {
                System.out.println("Mystery Pair: " + i + " + " + reverseI + " = " + n);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 121;
        if (isMysteryNumber(number)) {
            System.out.println(number + " is a Mystery Number.");
        } else {
            System.out.println(number + " is not a Mystery Number.");
        }
    }
}
