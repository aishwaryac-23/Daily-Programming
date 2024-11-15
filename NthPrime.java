import java.util.Scanner;
public class NthPrime {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nthPrime(int n) {
        int count = 0;
        int num = 2;

        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == n) {
                    return num;
                }
            }
            num++;
        }
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println("The " + n + "th prime number is: " + nthPrime(n));
    }
}
/*
The 10th prime number is: 29
 */