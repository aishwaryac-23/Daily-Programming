public class MersennePrimes {
    public static void main(String[] args) {
        int limit = 100000;
        System.out.println("Mersenne Primes up to " + limit + ":");

        for (int p = 2; ; p++) {
            if (isPrime(p)) {
                int mp = (int)Math.pow(2, p) - 1;
                if (mp > limit)
                    break;
                if (isPrime(mp))
                    System.out.println(mp);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
