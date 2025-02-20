import java.util.Scanner;

public class MagnanimousNumber {
    static boolean isMagnanimous(int num) {
        String str = Integer.toString(num);
        int len = str.length();
        for (int i = 1; i < len; i++) {
            int part1 = Integer.parseInt(str.substring(0, i));
            int part2 = Integer.parseInt(str.substring(i));
            if (part1 + part2 == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        System.out.println(isMagnanimous(num) ? "Yes" : "No");
    }
}
