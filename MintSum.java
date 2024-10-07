import java.util.*;
class MintSum {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int sum=obj.nextInt();
        int n=obj.nextInt();
        int prev=0;
        for(int i=1;i<n;i++){
            prev=sum-1;
            sum+=prev;
        }
        System.out.println(sum);
    }
}
