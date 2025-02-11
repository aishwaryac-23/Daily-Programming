import java.util.HashMap;
import java.util.Map;

public class FrugalNumberChecker {

    public static boolean isFrugal(int number) {
        if (number <= 1) return false;

        int originalDigitCount = String.valueOf(number).length();
        Map<Integer, Integer> primeFactors = getPrimeFactors(number);
        int factorDigitCount = 0;

        for (Map.Entry<Integer, Integer> entry : primeFactors.entrySet()) {
            factorDigitCount += String.valueOf(entry.getKey()).length();
            if (entry.getValue() > 1) {
                factorDigitCount += String.valueOf(entry.getValue()).length();
            }
        }

        return originalDigitCount > factorDigitCount;
    }

    private static Map<Integer, Integer> getPrimeFactors(int number) {
        Map<Integer, Integer> factors = new HashMap<>();
        for (int i = 2; i <= number / i; i++) {
            while (number % i == 0) {
                factors.put(i, factors.getOrDefault(i, 0) + 1);
                number /= i;
            }
        }
        if (number > 1) {
            factors.put(number, 1);
        }
        return factors;
    }

    public static void main(String[] args) {
        int[] testNumbers = {125, 128, 144, 150, 169};
        for (int num : testNumbers) {
            System.out.println(num + " is frugal: " + isFrugal(num));
        }
    }
}
