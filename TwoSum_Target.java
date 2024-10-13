import java.util.*;
class TwoSum_Target {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int t=obj.nextInt();//Target
        int  n=obj.nextInt();
        Integer[] arr=new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        Arrays.sort(arr,Collections.reverseOrder());
        int res[]=Target(arr,n,t);
        System.out.println(res[0]+" "+res[1]);
    }
    public static int[] Target(Integer arr[],int n,int t){
        int s=0,e=n-1;
        int array[]={0,0};
        int maxprod=-1;
        while(s<e){
            int sum=arr[s]+arr[e];
            if(sum==t){
                int prod=arr[s]*arr[e];
                if(prod>maxprod){
                    maxprod=prod;
                    array[0]=arr[s];
                    array[1]=arr[e];
                }
                s++;
                e--;
            }
            if(sum<t){
                e--;
            }
            if(sum>t){
                s++;
            }
        }
        return array;
    }
}
/*
10
5
5 1 3 7 9
7 3
 */