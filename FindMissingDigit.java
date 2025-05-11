import java.util.Scanner;

public class FindMissingDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();
        sc.close();

        String[] parts = expr.split(" ");
        String left = parts[0];
        String op = parts[1];
        String right = parts[2];
        String result = parts[4];

        for (int i = 0; i <= 9; i++) {
            String l = left.replace('x', (char) (i + '0'));
            String r = right.replace('x', (char) (i + '0'));
            String res = result.replace('x', (char) (i + '0'));

            int a = Integer.parseInt(l);
            int b = Integer.parseInt(r);
            int c = Integer.parseInt(res);

            boolean valid = false;
            if (op.equals("+")) valid = a + b == c;
            else if (op.equals("-")) valid = a - b == c;
            else if (op.equals("*")) valid = a * b == c;
            else if (op.equals("/")) valid = b != 0 && a / b == c;

            if (valid) {
                System.out.println("Missing digit: " + i);
                return;
            }
        }

        System.out.println("No valid digit found.");
    }
}
