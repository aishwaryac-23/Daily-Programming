import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = scanner.nextLine();
        int decimal = Integer.parseInt(octal, 8);
        System.out.println("Decimal equivalent: " + decimal);
        scanner.close();
    }
}
