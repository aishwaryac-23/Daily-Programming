import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Set<Integer> uniqueCheck = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (!uniqueCheck.add(a)) {
                System.out.print(0);
                return; 
            }
            arr[i] = a;
        }
        int result = calculateSumOfSecondLargest(n, arr);
        System.out.print(result);
    }

    public static int calculateSumOfSecondLargest(int n, int[] arr) {
        if (n <= 3 && arr!=null) {
            return 0;
        }
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                list1.add(arr[i]);
            } else {
                list2.add(arr[i]);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);

        if (list1.size() < 2 || list2.size() < 2) {
            return 0;
        }

        return list1.get(list1.size() - 2) + list2.get(list2.size() - 2);
    }
}
