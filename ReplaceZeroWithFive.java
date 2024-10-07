import java.util.*;
class ReplaceZeroWithFive {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        String s=Integer.toString(n);
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='0'){
                res.append(5);
            }
            else
                res.append(a);
        }
        System.out.println(Integer.parseInt(res.toString()));
    }
}
