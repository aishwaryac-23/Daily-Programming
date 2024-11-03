import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        System.out.println(isDuckNumber(number) ? "Duck Number" : "Not a Duck Number");
    }

    public static boolean isDuckNumber(String number) {
        if (number.charAt(0) == '0') return false;
        for (int i = 1; i < number.length(); i++) {
            if (number.charAt(i) == '0') return true;
        }
        return false;
    }
}

/*
A Duck Number is a positive number that has at least one zero in it, but it should not start with a zero.

Input:
Enter a number: 1023
Output:
Duck Number

Input:
Enter a number: 1234
Output:
Not a Duck Number

Input:
Enter a number: 02345
Output:
Not a Duck Number
 */