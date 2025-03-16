public class SternsDiatomicSeries {
    public static void main(String[] args) {
        int N = 20; 
        for (int i = 0; i < N; i++) {
            System.out.print(stern(i) + " ");
        }
    }

    public static int stern(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n % 2 == 0) return stern(n / 2);
        return stern(n / 2) + stern(n / 2 + 1);
    }
}
