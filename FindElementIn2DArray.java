import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int m=obj.nextInt();
		int arr[][] =new int[n][m];
		int count=0;
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        arr[i][j]=obj.nextInt();
		    }
		}
		for(int[]a:arr){
		    Arrays.sort(a);
		}
		int k=obj.nextInt();
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        if(arr[i][j]==k){
		            System.out.println(i+" "+j);
		            count++;
		            break;
		        }
		    }
		}
		if(count==0) System.out.println("-1");
	}
}
