package balance_paranthesis;
import java.util.*;
public class balance_paranthesis {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='('||ch=='{'||ch=='[')
				st.push(ch);
			else {
				if(st.isEmpty()) {
					System.out.println("Unbalanced");
					st.push('}');
					break;
				}
				if(ch==')') {
					char top=st.pop();
					if(top!='(') {
						System.out.println("Unbalanced");
						break;
					}			
				}
				if(ch=='}') {
					char top=st.pop();
					if(top!='{') {
						System.out.println("Unbalanced");
						break;
			}
		}
				if(ch==']') {
					char top=st.pop();
					if(top!='[') {
						System.out.println("Unbalanced");
						break;
	}
}
}
		}
		if(st.isEmpty())
			System.out.println("Balanced");
	}
}