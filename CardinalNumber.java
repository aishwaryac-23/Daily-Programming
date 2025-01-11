import java.util.Scanner;

public class CardinalNumber {
    public static void main(String[] args) {
        String[] cardinalWords = {
            "zero", "one", "two", "three", "four", 
            "five", "six", "seven", "eight", "nine", "ten"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (0-10): ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 10) {
            System.out.println("The cardinal word for " + number + " is: " + cardinalWords[number]);
        } else {
            System.out.println("Please enter a number between 0 and 10.");
        }

        scanner.close();
    }
}
