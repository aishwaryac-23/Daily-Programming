import java.util.*;

public class KyneaNumber {
    public static boolean isKynea(int n) {
        int k = 0;
        while (true) {
            int kynea = (int) Math.pow(2, k) * (int) Math.pow(2, k + 1) - 1;
            if (kynea == n) return true;
            if (kynea > n) return false;
            k++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isKynea(n));
        sc.close();
    }
}
