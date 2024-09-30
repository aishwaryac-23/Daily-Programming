import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    int n=obj.nextInt();
	    int[]hash=new int[100];
	    for(int i=0;i<n;i++){
	        hash[obj.nextInt()]++;
	    }
	    int res=0;
	    for(int p:hash){
	        res+=p/2;
	    }
	    System.out.println(res);
	}
}
