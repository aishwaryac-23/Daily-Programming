public class ThreeDigitArmstrong {
    public static void main(String[] args) {
        for(int i = 100; i <= 999; i++) {
            int sum = 0, num = i;
            while(num > 0) {
                int digit = num % 10;
                sum += digit * digit * digit;
                num /= 10;
            }
            if(sum == i)
                System.out.println(i);
        }
    }
}
