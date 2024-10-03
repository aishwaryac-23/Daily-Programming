import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int m=obj.nextInt();
        System.out.println(MultipleDifference(n,m));
    }
    public static int MultipleDifference(int n,int m){
        int sum=0,sum1=0;
        for(int i=1;i<=m;i++){
            if(i%n==0){
                sum+=i;
            }
            else{
                sum1+=i;
            }
        }
        return Math.abs(sum1-sum);
    }
}
