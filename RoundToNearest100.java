import java.util.Scanner;

public class RoundToNearest100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int rounded = ((num + 50) / 100) * 100;
        System.out.println("Rounded to nearest 100: " + rounded);
    }
}
