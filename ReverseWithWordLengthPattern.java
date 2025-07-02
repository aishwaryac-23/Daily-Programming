import java.util.*;

public class ReverseWithWordLengthPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replaceAll(" ", "");

        int[] wordLengths = getWordLengths(sc.nextLine()); // e.g., "3 3 2 9 2 4"

        String reversed = new StringBuilder(input).reverse().toString();

        StringBuilder result = new StringBuilder();
        int index = 0;

        for (int i = wordLengths.length - 1; i >= 0; i--) {
            int len = wordLengths[i];
            if (index + len <= reversed.length()) {
                result.append(reversed, index, index + len).append(" ");
                index += len;
            }
        }

        System.out.println(result.toString().trim());
    }

    private static int[] getWordLengths(String line) {
        String[] parts = line.trim().split("\\s+");
        int[] lengths = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            lengths[i] = Integer.parseInt(parts[i]);
        }
        return lengths;
    }
}
