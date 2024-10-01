import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    int n=obj.nextInt();
		System.out.println(DiceSum(n));
	}
	
	public static int DiceSum(int n){
	    int count=0;
	    for(int i=1;i<=6;i++){
	        if((n-i)<=6){
	            System.out.println(i+" , "+(n-i));
	            count++;
	        }
	    }
	    return count;
	}
}
