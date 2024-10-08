import java.util.*;
class ChocolateMinimumCost {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        int t = obj.nextInt();
        Arrays.sort(arr);
        System.out.println(MinimumCost(n,arr,t));
    }
    public static int MinimumCost(int n,int[] arr,int t){
        int sum=0;
        if(n<t){
            return -1;
        }
        for (int i = 0; i < t; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
