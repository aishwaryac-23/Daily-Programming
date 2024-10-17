import java.util.*;
class VowelsPermutation {
    public  static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String st = obj.next();
        System.out.println(Permutation(st));
    }
    public static int Permutation(String st){
        int count=0,len=0,n=1;
        for(int i=0;i<st.length();i++){
            char c=st.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                count++;
            }
        }
        len=st.length()-count;
        for(int i=1;i<=len;i++){
            n*=i;
        }
        return n;
    }
}
/*
abcdef
24

CDF
6

ABC
2
 */