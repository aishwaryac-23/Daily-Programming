import java.util.Scanner;

public class FascinatingNumber {
    
    public static boolean isFascinating(int number) {
        int num2 = number * 2;
        int num3 = number * 3;
        
        String concatenated = Integer.toString(number) + Integer.toString(num2) + Integer.toString(num3);
        
        if (concatenated.length() != 9) {
            return false;
        }
        
        for (char digit = '1'; digit <= '9'; digit++) {
            if (concatenated.indexOf(digit) == -1) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isFascinating(number)) {
            System.out.println(number + " is a Fascinating Number.");
        } else {
            System.out.println(number + " is not a Fascinating Number.");
        }
        
        scanner.close();
    }
}
