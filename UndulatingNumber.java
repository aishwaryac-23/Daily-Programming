import java.util.*;

public class UndulatingNumber {
    public static boolean isUndulating(int n) {
        String s = Integer.toString(n);
        if (s.length() < 3) return false;
        for (int i = 2; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 2) || s.charAt(i) == s.charAt(i - 1)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isUndulating(n));
        sc.close();
    }
}
