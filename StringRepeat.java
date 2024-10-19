import java.util.*;
class StringRepeat {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int n=obj.nextInt();
        System.out.println(isRepeatString(s,n));
    }
    public static String isRepeatString(String s,int n){
        String s1="";
        for(int i=0;i<n;i++){
            s1+=s;
        }
        return s1;
    }
}
