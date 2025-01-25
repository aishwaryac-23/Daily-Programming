import java.util.Scanner;

public class CullenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        boolean isCullen = false;
        for (int i = 0; i <= n; i++) {
            if ((i * (1 << i) + 1) == n) {
                isCullen = true;
                break;
            }
        }
        System.out.println(n + (isCullen ? " is a Cullen number." : " is not a Cullen number."));
    }
}
