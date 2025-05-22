import java.util.Scanner;

public class PadNumberWithZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();  // input number
        int width = sc.nextInt();   // desired total number of digits
        sc.close();

        String numStr = String.valueOf(number);
        int len = numStr.length();

        while (len < width) {
            numStr = "0" + numStr;
            len++;
        }

        System.out.println("Padded number: " + numStr);
    }
}
