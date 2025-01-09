public class UniqueNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 5, 3, 4};
        int unique = findUnique(arr);
        System.out.println("The unique number is: " + unique);
    }

    public static int findUnique(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num;
        }
        return result;
    }
}
