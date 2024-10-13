import java.util.*;
class Palindrome {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String st=obj.next();
        //System.out.println(isPalindrome(st));
        if (isPalindrome(st)) {

        }
    }
    public static boolean isPalindrome(String st) {
        int l = 0, r = st.length() - 1;
        while (l < r) {
            if (st.charAt(l) == st.charAt(r)) {
                return true;
            }
            l++;
            r--;
        }
        return false;
    }
}
