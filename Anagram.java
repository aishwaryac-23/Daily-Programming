package string;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String st1=obj.nextLine();
		String st2=obj.nextLine();
		st1=st1.toLowerCase(); st2=st2.toLowerCase();
		if(st1.length()!=st2.length()) 
			System.out.println("Not Anagram");
		else {
		char[] s1=st1.toCharArray();
		char[] s2=st2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		if(Arrays.equals(s1,s2)==true)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}

}
}

