import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int r=obj.nextInt();
		int unit=obj.nextInt();
		int n=obj.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=obj.nextInt();
		}
		int res=rat(r,unit,n,arr);
		System.out.println(res);
	}
		public static int rat(int r,int unit,int n,int arr[]){
    		int tot=r*unit,sum=0,count=0;
    		for(int i=0;i<n;i++){
    		    if(arr[i]== 0){
    		        return -1;
    		    }
    		    if(sum<=tot){
    		        sum+=arr[i];
    		        count++;
    		    }
    		}
    		if(sum<tot)
    		    return 0;
    		else
    		    return count;
		}
}
