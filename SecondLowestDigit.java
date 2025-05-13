import java.util.Scanner;

public class SecondLowestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        boolean[] digitPresent = new boolean[10];

        while (num > 0) {
            int digit = num % 10;
            digitPresent[digit] = true;
            num /= 10;
        }

        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (digitPresent[i]) {
                count++;
                if (count == 2) {
                    System.out.println("Second lowest digit: " + i);
                    return;
                }
            }
        }

        System.out.println("Second lowest digit not found.");
    }
}
