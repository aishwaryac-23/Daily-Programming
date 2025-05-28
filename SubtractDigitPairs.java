import java.util.Scanner;

public class SubtractDigitPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        while (number >= 10) {
            int d1 = number % 10;
            number /= 10;
            int d2 = number % 10;
            number /= 10;
            int diff = d2 - d1;
            System.out.print(diff + " ");
        }
    }
}
