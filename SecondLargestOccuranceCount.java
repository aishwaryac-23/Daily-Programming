import java.util.*;
class SecondLargestOccuranceCount {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println(isSecondLargestCount(arr,n));
    }
    public static int isSecondLargestCount(int[] arr,int n){
        int firstLargest=0,secondLargest=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > firstLargest) {
                firstLargest = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] < firstLargest) {
                secondLargest = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==secondLargest){
                count++;
            }
        }
        return count;
    }
}
