import java.util.ArrayList;

public class SublimeNumber {
    // Function to check if a number is perfect
    public static boolean isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    // Function to check if a number is sublime
    public static boolean isSublime(int num) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int sum = 0;

        // Find all divisors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
                sum += i;
            }
        }

        // Check if the number of divisors is perfect and the sum of divisors is perfect
        return isPerfect(divisors.size()) && isPerfect(sum);
    }

    public static void main(String[] args) {
        int number = 12; // You can change this number to test
        if (isSublime(number)) {
            System.out.println(number + " is a sublime number.");
        } else {
            System.out.println(number + " is not a sublime number.");
        }
    }
}
