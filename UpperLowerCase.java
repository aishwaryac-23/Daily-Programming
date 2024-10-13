import java.util.*;
class UpperLowerCase {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String st=obj.next();
        System.out.println(result(st));
    }
    public static String result(String st){
        int uc=0,lc=0;
        for(int i=0;i<st.length();i++){
            char c=st.charAt(i);
            if(c>='A' && c<='Z'){
                uc++;
            }
            else lc++;
        }
        if(uc>lc) return st.toUpperCase();
        else return st.toLowerCase();
    }
}
