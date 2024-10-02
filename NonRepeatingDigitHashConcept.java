import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        System.out.println(Nonrepeated(n,m));
    }
    public static int Nonrepeated(int n,int m){
        int count=0;
        for(int i=n;i<=m;i++){
            if(check(i)){
                System.out.println(i);
                count++;
            }
        }
        return count;
    }
    
    public static boolean check(int i){
        int[] hash=new int[10];
        String s=i+"";
        for(int j=0;j<s.length();j++){
            hash[s.charAt(j)-'0']++;
            if(hash[s.charAt(j)-'0']>1){
                return false;
            }
        }
        return true;
    }
}
