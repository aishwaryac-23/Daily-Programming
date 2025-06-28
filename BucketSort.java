import java.util.*;

public class BucketSort {
    public static void bucketSort(float[] arr, int n) {
        @SuppressWarnings("unchecked")
        List<Float>[] buckets = new List[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            int bucketIndex = (int)(arr[i] * n);
            buckets[bucketIndex].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float value : buckets[i]) {
                arr[index++] = value;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr = new float[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }

        bucketSort(arr, n);

        for (float value : arr) {
            System.out.print(value + " ");
        }
    }
}
