import java.util.Scanner;

public class PancakeNumber {
    public static int pancakeNumber(int n) {
        return (int) Math.ceil((5 * n) / 3.0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pancakeNumber(n));
        sc.close();
    }
}
