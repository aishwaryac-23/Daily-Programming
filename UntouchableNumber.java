public class UntouchableNumber {

    public static boolean isUntouchable(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= 10000; i++) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) sum += j;
            }
            if (sum == n) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 4;
        if (isUntouchable(number)) {
            System.out.println(number + " is an untouchable number.");
        } else {
            System.out.println(number + " is not an untouchable number.");
        }
    }
}
