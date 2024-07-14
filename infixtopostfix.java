package balance_paranthesis;
import java.util.*;
public class infixtopostfix {
	static int priority(char c) {
		int n=0;
		switch(c) {
		case '$':
		case '^':
			n=4;
			break;
		case '*':
		case '/':
			n=3;
			break;
		case '+':
		case '-':
			n=2;
			break;
		case '=':
			n=1;
			break;
		}
		return n;
	}
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	Stack<Character> itop=new Stack<>();
	String s=obj.nextLine();
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(Character.isAlphabetic(c)||Character.isDigit(c)) {
			System.out.print(c+" ");
		}
		else {
			if(c=='(') {
				itop.push(c);
			}
			else if(c==')') {
				char a=')';
				while(a!='(') {
					a=itop.pop();
					if(a!='(' && a!=')')
						System.out.print(a+" ");
				}
			}else {
				int f=priority(itop.peek());
				int se=priority(c);
				if(f<se)
					itop.push(c);
				else {
					System.out.print(itop.pop()+" ");
					itop.push(c);
				}
			}
		}
	}
}
}
