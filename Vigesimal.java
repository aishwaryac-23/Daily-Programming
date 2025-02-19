public class Vigesimal {
    public static void main(String[] args) {
        int number = 123456789;
        System.out.println(toVigesimal(number));
    }
    
    public static String toVigesimal(int n) {
        if (n == 0) return "0";
        String digits = "0123456789ABCDEFGHIJ";
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(digits.charAt(n % 20));
            n /= 20;
        }
        return sb.reverse().toString();
    }
}
