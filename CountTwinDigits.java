import java.util.Scanner;

public class CountTwinDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        sc.close();

        int count = 0;

        for (int i = 0; i < num.length() - 1; i++) {
            if (num.charAt(i) == num.charAt(i + 1)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
