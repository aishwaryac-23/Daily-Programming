import java.util.Scanner;

public class FindLetterInStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of strings
        sc.nextLine(); // consume newline

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        char target = sc.next().charAt(0); // Letter to search

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i].indexOf(target) != -1) {
                System.out.println("Letter '" + target + "' found in: " + arr[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Letter '" + target + "' not found in any string.");
        }
    }
}
