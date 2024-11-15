import java.util.Scanner;

public class StrontioNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        int number = scanner.nextInt();
        
        if (isStrontio(number)) {
            System.out.println(number + " is a Strontio number.");
        } else {
            System.out.println(number + " is not a Strontio number.");
        }
        
        scanner.close();
    }
    
    public static boolean isStrontio(int number) {
        if (number < 1000 || number > 9999) {
            return false;
        }
        
        int multipliedNumber = number * 2;
        int middleTwoDigits = (multipliedNumber / 10) % 100;
        
        return (middleTwoDigits / 10) == (middleTwoDigits % 10);
    }
}
