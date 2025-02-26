import java.util.*;

public class EconomicalNumber {
    public static boolean isEconomical(int n) {
        int digitCount = String.valueOf(n).length();
        Map<Integer, Integer> primeFactors = new HashMap<>();
        int num = n;
        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                primeFactors.put(i, primeFactors.getOrDefault(i, 0) + 1);
                num /= i;
            }
        }
        if (num > 1) primeFactors.put(num, 1);
        int factorDigitCount = 0;
        for (Map.Entry<Integer, Integer> entry : primeFactors.entrySet()) {
            factorDigitCount += String.valueOf(entry.getKey()).length();
            if (entry.getValue() > 1) factorDigitCount += String.valueOf(entry.getValue()).length();
        }
        return factorDigitCount <= digitCount;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isEconomical(n));
        sc.close();
    }
}
