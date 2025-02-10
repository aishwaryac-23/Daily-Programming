import java.util.Scanner;

public class StraightLineNumber {
    public static boolean isStraightLine(int n) {
        int diff = -1, prev = n % 10;
        n /= 10;
        while (n > 0) {
            int curr = n % 10;
            if (diff == -1) diff = prev - curr;
            else if (prev - curr != diff) return false;
            prev = curr;
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isStraightLine(n) ? "Straight Line Number" : "Not a Straight Line Number");
        sc.close();
    }
}
