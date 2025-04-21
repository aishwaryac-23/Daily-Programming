import java.util.Scanner;

public class TechNumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower bound: ");
        int start = scanner.nextInt();
        System.out.print("Enter upper bound: ");
        int end = scanner.nextInt();
        scanner.close();

        System.out.println("Tech numbers in the range:");
        for (int num = start; num <= end; num++) {
            if (isTechNumber(num)) {
                System.out.print(num + " ");
            }
        }
    }

    static boolean isTechNumber(int num) {
        String s = String.valueOf(num);
        if (s.length() % 2 != 0) return false;

        int mid = s.length() / 2;
        int firstHalf = Integer.parseInt(s.substring(0, mid));
        int secondHalf = Integer.parseInt(s.substring(mid));

        int sum = firstHalf + secondHalf;
        return sum * sum == num;
    }
}
