import java.util.Scanner;

class MiddleDigitOfNumber {
    public int middleDigit(int number) {
        if (number < 100 || number > 999) {
            return -1; 
        }
        return (number / 10) % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MiddleDigitOfNumber finder = new MiddleDigitOfNumber();

        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();

        int middleDigit = finder.middleDigit(number);

        if (middleDigit == -1) {
            System.out.println("Invalid input. Please enter a 3-digit number.");
        } else {
            System.out.println("The middle digit is: " + middleDigit);
        }

        scanner.close();
    }
}
