import java.util.*;
class RunsNeededQualification {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n= obj.nextInt();
        int m= obj.nextInt();
        int r= obj.nextInt();
        int[] w=new int[n-1];
        int sum=0,totrun,neededrun;
        for(int i=0;i<n-1;i++){
            w[i]=obj.nextInt();
            sum+=w[i];
        }
        totrun=r*n;
        neededrun=totrun-sum;
        if(neededrun<m)
            System.out.println("NeededRun : "+neededrun);
        else
            System.out.println("-1");
    }
}
/*
Input:
n=4
m=20
r=40
w=10 5 0
Output:
-1

Input:
n=4
m=20
r=9
w=10 0 9
NeededRun : 17
 */