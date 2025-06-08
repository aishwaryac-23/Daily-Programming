import java.util.Scanner;

public class FibonacciRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int a = 0, b = 1;
        while (a <= R) {
            if (a >= L) {
                System.out.print(a + " ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }
}
