import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (1 to 3999): ");
        int num = scanner.nextInt();

        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40, 10,  9,   5,  4,  1};
        String[] romans = {"M",  "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};

        String result = "";
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result += romans[i];
                num -= values[i];
            }
        }

        System.out.println("Roman numeral: " + result);
        scanner.close();
    }
}
