import java.util.Scanner;

public class EntringerNumber {
    static int entringer(int n, int k) {
        if (n == 0 && k == 0) return 1;
        if (k == 0) return 0;
        return entringer(n, k - 1) + entringer(n - 1, n - k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        System.out.println(entringer(n, k));
        sc.close();
    }
}
