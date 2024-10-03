import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println(TrailingZeros(n));
    }
    public static int TrailingZeros(int n){
        int sum=0;
        if(n<5) return 0;
        while(n>=5){
            sum+=n/5;
            n/=5;
        }
        return sum;
    }
}
