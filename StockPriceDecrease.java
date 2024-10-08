import java.util.*;
class StockPriceDecrease {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n =obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println(NegativeDecrease(arr,n));
    }
    public static int NegativeDecrease(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                count++;
            }
        }
        return count;
    }
}
/*
Input:
n=4
arr[]={8,2,-7,-6}
Output:
2
 */
