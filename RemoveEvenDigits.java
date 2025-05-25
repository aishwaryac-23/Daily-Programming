import java.util.Scanner;

public class RemoveEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        int result = 0, place = 1;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                result += digit * place;
                place *= 10;
            }
            number /= 10;
        }

        System.out.println(result);
    }
}
