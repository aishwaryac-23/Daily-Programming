import java.util.*;
class Main{
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
        Arrays.sort(arr);
        int sum=0,ab1,ab2;
        sum=(arr[1]-arr[0])+(arr[n-1]-arr[n-2]);
        for(int i=1;i<n-1;i++){
            ab1=arr[i]-arr[i-1];
            ab2=arr[i+1]-arr[i];
            sum+=Math.min(ab1,ab2);
        }
        return sum;
    }
}
