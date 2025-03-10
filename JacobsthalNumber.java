import java.util.Scanner;

public class JacobsthalNumber {
    public static int jacobsthal(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return jacobsthal(n - 1) + 2 * jacobsthal(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(jacobsthal(n));
        sc.close();
    }
}
