import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
    
        if (number % 7 == 0 || number % 10 == 7) {
            System.out.println(number + " is a Buzz number.");
        } else {
            System.out.println(number + " is not a Buzz number.");
        }
    }
}
