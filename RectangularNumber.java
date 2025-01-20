import java.util.Scanner;

public class RectangularNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isRectangular = false;
        for (int i = 1; i * i < number; i++) {
            if (number % i == 0) {
                isRectangular = true;
                break;
            }
        }
        System.out.println(isRectangular ? "Yes" : "No");
    }
}
