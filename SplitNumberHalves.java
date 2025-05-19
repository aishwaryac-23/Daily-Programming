import java.util.Scanner;

public class SplitNumberHalves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        sc.close();

        int len = num.length();
        int mid = len / 2;

        String left, right;

        if (len % 2 == 0) {
            left = num.substring(0, mid);
            right = num.substring(mid);
        } else {
            left = num.substring(0, mid);
            right = num.substring(mid); // middle digit goes to right half
        }

        System.out.println("Left half: " + left);
        System.out.println("Right half: " + right);
    }
}
