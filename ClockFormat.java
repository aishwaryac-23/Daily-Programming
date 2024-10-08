import java.util.*;
class ClockFormat {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        System.out.println(Hours(n,m));
    }
    public static int Hours(int n,int m){
        int hrs = n * m;
        if(hrs<=0 || hrs>24)
            return -1;
        else if(hrs<=12)
            return hrs;
        else
            return hrs-12;
    }
}
/*
Input:
n=2
m=5
Output:
10
 */
