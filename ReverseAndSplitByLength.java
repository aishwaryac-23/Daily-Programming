import java.util.*;

public class ReverseAndSplitByLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine(); // Input sentence
        int[] wordLengths = getWordLengths(sc.nextLine()); // Input lengths, e.g., "3 3 2 9 2 4"

        String lettersOnly = line.replaceAll(" ", "");
        String reversed = new StringBuilder(lettersOnly).reverse().toString();

        int index = 0;
        for (int len : wordLengths) {
            if (index + len <= reversed.length()) {
                String part = reversed.substring(index, index + len);
                System.out.println(len + " " + part);
                index += len;
            }
        }
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
