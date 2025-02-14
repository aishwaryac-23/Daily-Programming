import java.util.Scanner;

public class Repdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = n % 10;
        
        while (n > 0) {
            if (n % 10 != digit) {
                System.out.println("Not a repdigit");
                return;
            }
            n /= 10;
        }
        System.out.println("Repdigit");
    }
}
