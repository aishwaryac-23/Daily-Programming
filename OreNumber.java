import java.util.Scanner;

public class OreNumber {
    public static boolean isOreNumber(int n) {
        int sum = 0, count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += n / i;
                count++;
            }
        }
        return sum * n == count * count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isOreNumber(n));
    }
}

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isOreNumber(n));
    }
}
