public class SmithNumber {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static int sumOfPrimeFactorsDigits(int num) {
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0 && isPrime(i)) {
                sum += sumOfDigits(i);
                num /= i;
            }
        }
        return sum;
    }

    public static boolean isSmithNumber(int num) {
        if (isPrime(num)) return false;
        int sumDigits = sumOfDigits(num);
        int sumPrimeFactorsDigits = sumOfPrimeFactorsDigits(num);
        return sumDigits == sumPrimeFactorsDigits;
    }

    public static void main(String[] args) {
        int number = 666;
        if (isSmithNumber(number)) {
            System.out.println(number + " is a Smith number.");
        } else {
            System.out.println(number + " is not a Smith number.");
        }
    }
}
/*
A Smith number is a composite number (non-prime) whose sum of digits is equal to the sum of the digits of its prime factors (excluding 1). To determine if a number is a Smith number in Java, we need to:

Check if the number is composite (it must have factors other than 1 and itself).
Calculate the sum of its digits.
Find the prime factors of the number and calculate the sum of the digits of those factors.
Compare the two sums to see if they are equal.

666 is a Smith number.
 */