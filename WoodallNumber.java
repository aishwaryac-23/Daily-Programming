import java.util.*;

public class WoodallNumber {
    public static boolean isWoodall(int n) {
        int k = 0;
        while (true) {
            int woodall = k * (int) Math.pow(2, k) - 1;
            if (woodall == n) return true;
            if (woodall > n) return false;
            k++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isWoodall(n));
        sc.close();
    }
}
