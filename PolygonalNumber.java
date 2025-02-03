import java.util.Scanner;

public class PolygonalNumber {
    static int getPolygonalNumber(int s, int n) {
        return ((s - 2) * n * (n - 1)) / 2 + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(getPolygonalNumber(s, n));
        sc.close();
    }
}
