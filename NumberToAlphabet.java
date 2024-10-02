import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String st = obj.next();
        StringBuilder result = new StringBuilder();
        
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            char s = (char) ('a' + (ch - '1'));
            result.append(s);
        }
        System.out.println(result.toString());
    }
}
