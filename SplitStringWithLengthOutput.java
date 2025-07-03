import java.util.*;

public class SplitStringWithLengthOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter lengths (space-separated): ");
        String[] parts = sc.nextLine().split(" ");
        int[] lengths = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            lengths[i] = Integer.parseInt(parts[i]);
        }

        int index = 0;
        for (int len : lengths) {
            if (index + len <= str.length()) {
                String part = str.substring(index, index + len);
                System.out.println(len + " " + part);
                index += len;
            } else {
                System.out.println(len + " - Not enough characters left");
                break;
            }
        }
    }
}
