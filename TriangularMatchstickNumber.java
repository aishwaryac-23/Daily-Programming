import java.util.*;

public class TriangularMatchstickNumber {
    public static int matchstickCount(int n) {
        return (3 * n * (n + 1)) / 2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(matchstickCount(n));
        sc.close();
    }
}
