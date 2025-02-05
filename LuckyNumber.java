import java.util.Scanner;

public class LuckyNumber {
    static boolean isLucky(int n, int counter) {
        if (n < counter) return true;
        if (n % counter == 0) return false;
        return isLucky(n - (n / counter), counter + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isLucky(n, 2) ? "Lucky Number" : "Not a Lucky Number");
        sc.close();
    }
}
