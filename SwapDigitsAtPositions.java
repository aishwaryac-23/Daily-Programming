import java.util.Scanner;

public class SwapDigitsAtPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();     // number to operate on
        int pos1 = sc.nextInt();    // first position (1-based from left)
        int pos2 = sc.nextInt();    // second position (1-based from left)
        sc.close();

        StringBuilder sb = new StringBuilder(String.valueOf(num));
        int len = sb.length();

        if (pos1 < 1 || pos2 < 1 || pos1 > len || pos2 > len) {
            System.out.println("Invalid positions");
            return;
        }

        int i = pos1 - 1;
        int j = pos2 - 1;

        char temp = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, temp);

        System.out.println("Result after swapping: " + sb.toString());
    }
}
