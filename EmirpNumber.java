import java.util.Scanner;

public class EmirpNumber {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    public static boolean isEmirp(int num) {
        if (!isPrime(num)) return false;
        int reversed = reverseNumber(num);
        return reversed != num && isPrime(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an EMIRP: ");
        int number = scanner.nextInt();
        scanner.close();

        if (isEmirp(number)) {
            System.out.println(number + " is an EMIRP number.");
        } else {
            System.out.println(number + " is not an EMIRP number.");
        }
    }
}
/*
Enter a number to check if it is an EMIRP: 13
13 is an EMIRP number.
Enter a number to check if it is an EMIRP: 11
11 is not an EMIRP number.
 */