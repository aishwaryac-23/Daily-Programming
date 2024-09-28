import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int n1=0,n2=1;
		int n3=0;
		for(int i=0;i<n;i++){
		    n3=n1+n2;
		    n1=n2;
		    n2=n3;
		}
		System.out.println(n3);
	}
}
