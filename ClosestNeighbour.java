import java.util.*;
class ClosestNeighbour{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println(Neighbour(arr,n));
    }
    public static int Neighbour(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(i==n-1){
                sum+=Math.abs(arr[0]-arr[n-1]);
            }
            else{
                sum+=Math.abs(arr[i]-arr[i+1]);
            }
        }
        return sum;
    }
}
