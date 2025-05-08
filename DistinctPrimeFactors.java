import java.util.Scanner;

public class DistinctPrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.print("Distinct Prime Factors: ");
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && isPrime(i)) {
                System.out.print(i + " ");
                while (num % i == 0) {
                    num /= i;
                }
            }
        }
    }

    static boolean isPrime(int n) {
        if(n < 2) return false;
        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
