import java.util.Scanner;

public class Tetranacci {
    public static int tetranacci(int n) {
        if (n == 0 || n == 1 || n == 2) return 0;
        if (n == 3) return 1;
        
        int a = 0, b = 0, c = 0, d = 1, temp;
        for (int i = 4; i <= n; i++) {
            temp = a + b + c + d;
            a = b;
            b = c;
            c = d;
            d = temp;
        }
        return d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(tetranacci(n));
        scanner.close();
    }
}
