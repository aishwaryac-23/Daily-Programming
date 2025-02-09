import java.util.Scanner;

public class Fibodiv {
    public static int fibodiv(int n) {
        int a = 0, b = 1, c, count = 0;
        for (int i = 2; ; i++) {
            c = a + b;
            a = b;
            b = c;
            if (c % i == 0) count++;
            if (count == n) return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibodiv(n));
        sc.close();
    }
}
