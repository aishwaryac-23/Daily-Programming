public class LychrelNumber {
    public static void main(String[] args) {
        int number = 196;
        int maxIterations = 500;
        if (isLychrel(number, maxIterations)) {
            System.out.println(number + " is a Lychrel number.");
        } else {
            System.out.println(number + " is not a Lychrel number.");
        }
    }

    public static boolean isLychrel(int num, int maxIterations) {
        for (int i = 0; i < maxIterations; i++) {
            num += reverseNumber(num);
            if (isPalindrome(num)) {
                return false;
            }
        }
        return true;
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }
}
