import java.util.Scanner;

public class SquareFreeNumber {
    public static boolean isSquareFree(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % (i * i) == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(isSquareFree(num) ? "Square Free" : "Not Square Free");
        scanner.close();
    }
}
