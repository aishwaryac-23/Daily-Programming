import java.util.*;
class EvenSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        System.out.println(isEvenSum(n));
    }
    public static int isEvenSum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0)
                sum+=i;
        }
        return sum;
    }
}