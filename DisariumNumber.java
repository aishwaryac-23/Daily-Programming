import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sum = 0, temp = num, digits = Integer.toString(num).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits--);
            temp /= 10;
        }
        System.out.println(sum == num ? "Disarium Number" : "Not a Disarium Number");
        sc.close();
    }
}
