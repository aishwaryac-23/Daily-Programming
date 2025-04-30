import java.util.Scanner;
import java.util.Arrays;

public class VampireNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        scanner.close();

        if (isVampire(number)) {
            System.out.println(number + " is a Vampire Number.");
        } else {
            System.out.println(number + " is not a Vampire Number.");
        }
    }

    static boolean isVampire(long num) {
        String numStr = String.valueOf(num);
        int len = numStr.length();
        if (len % 2 != 0)
            return false;

        long start = (long) Math.pow(10, len / 2 - 1);
        long end = (long) Math.pow(10, len / 2);

        for (long i = start; i < end; i++) {
            if (num % i == 0) {
                long j = num / i;
                if (String.valueOf(j).length() != len / 2)
                    continue;
                if (i % 10 == 0 && j % 10 == 0)
                    continue;
                String fangs = String.valueOf(i) + String.valueOf(j);
                char[] original = numStr.toCharArray();
                char[] combined = fangs.toCharArray();
                Arrays.sort(original);
                Arrays.sort(combined);
                if (Arrays.equals(original, combined))
                    return true;
            }
        }
        return false;
    }
}
