import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    String st=obj.nextLine();
		System.out.println(Isogram(st));
	}
	
	public static boolean Isogram(String st){
	    char ch[]=new char[st.length()];
	    for(int i=0;i<st.length();i++){
	        char c=st.charAt(i);
	        for(int j=0;j<i;j++){
	            if(ch[j]==c){
	                return false;
	            }
	        }
	        ch[i]=c;
	    }
	    return true;
	}
}
