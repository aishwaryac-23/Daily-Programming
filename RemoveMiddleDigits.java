import java.util.Scanner;

public class RemoveMiddleDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        sc.close();

        int len = num.length();
        String result;

        if (len <= 2) {
            result = ""; // No middle digits left
        } else if (len % 2 == 0) {
            int mid = len / 2;
            result = num.substring(0, mid - 1) + num.substring(mid + 1);
        } else {
            int mid = len / 2;
            result = num.substring(0, mid) + num.substring(mid + 1);
        }

        System.out.println("After removing middle digit(s): " + result);
    }
}
