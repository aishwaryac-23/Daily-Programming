import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner obj=new Scanner(System.in);
	    String st=obj.nextLine();
		System.out.println(Isogram(st));
	}
	
	public static boolean Isogram(String st){
	   HashMap<Character,Integer> ch = new HashMap<>();
	   for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);

            if (ch.containsKey(c)) {
                return false;
            }
            ch.put(c, 1);
        }
        return true;
	}
}
