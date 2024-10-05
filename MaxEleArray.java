import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int arr[] =new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=obj.nextInt();
		}
		int res[]=Greatest(arr,n);
		System.out.println(res[0]+" "+res[1]);
	}
	public static int[] Greatest(int arr[],int n){
	    int index=0;
	    int max=arr[0];
		for(int i=0;i<n;i++){
		        if(arr[i]>max){
		            max=arr[i];
		            index = i;  
		        }
		    }
		return new int[]{max, index};
	}
}
