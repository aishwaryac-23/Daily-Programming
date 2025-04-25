import java.util.Scanner;

public class PronicCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isPronic(num)) {
            System.out.println(num + " is a Pronic Number.");
        } else {
            System.out.println(num + " is not a Pronic Number.");
        }
    }

    static boolean isPronic(int num) {
        for (int i = 0; i <= num; i++) {
            if (i * (i + 1) == num) {
                return true;
            }
        }
        return false;
    }
}
