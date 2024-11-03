import java.util.Scanner;

public class EvilNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = Integer.toBinaryString(number).replace("0", "").length();
        System.out.println(count % 2 == 0 ? "Evil Number" : "Not an Evil Number");
    }
}
