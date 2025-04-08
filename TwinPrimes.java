import java.util.Scanner;

public class TwinPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of twin prime pairs to print: ");
        int n = scanner.nextInt();
        
        int count = 0;
        int num = 3;
        
        while (count < n) {
            if (isPrime(num) && isPrime(num + 2)) {
                System.out.println("(" + num + ", " + (num + 2) + ")");
                count++;
            }
            num++;
        }

        scanner.close();
    }

    public static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}
