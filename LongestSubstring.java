import java.util.*;
class LongestSubstring {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String st=obj.nextLine();
        System.out.println(isLongest(st));
    }
    public static int isLongest(String st){
        int m=0;
        String[] arr=st.split("\\.");
        for (String s : arr) {
            if (m < s.length()) {
                m = s.length();
            }
        }
        return m;
    }
}
/*
ab.abcd.ab
4

abc.ab.c
3
 */