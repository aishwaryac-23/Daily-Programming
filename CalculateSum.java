import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    int n=obj.nextInt();
	    int m=obj.nextInt();
		System.out.println("Sum : "+Calculate(n,m));
	}
	
	public static int Calculate(int n,int m){
	    int sum=0;
	    for(int i=n;i<=m;i++){
	        if((i%3==0)&&(i%5==0)){
	            sum+=i;
	        }
	    }
	    return sum;
	}
}
