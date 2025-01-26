import java.util.*;

public class PancakeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] pancakes = new int[n];
        for (int i = 0; i < n; i++) pancakes[i] = scanner.nextInt();
        System.out.println(minimumFlips(pancakes));
    }

    static int minimumFlips(int[] pancakes) {
        int flips = 0;
        for (int size = pancakes.length; size > 1; size--) {
            int maxIndex = findMaxIndex(pancakes, size);
            if (maxIndex != size - 1) {
                flip(pancakes, maxIndex + 1);
                flip(pancakes, size);
                flips += 2;
            }
        }
        return flips;
    }

    static int findMaxIndex(int[] pancakes, int size) {
        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (pancakes[i] > pancakes[maxIndex]) maxIndex = i;
        }
        return maxIndex;
    }

    static void flip(int[] pancakes, int k) {
        for (int i = 0, j = k - 1; i < j; i++, j--) {
            int temp = pancakes[i];
            pancakes[i] = pancakes[j];
            pancakes[j] = temp;
        }
    }
}
