import java.util.Scanner;

public class SubstringSearch {
    public static boolean isSubstring(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == m) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String pattern = sc.nextLine();

        if (isSubstring(text, pattern))
            System.out.println("Substring found");
        else
            System.out.println("Substring not found");
    }
}
