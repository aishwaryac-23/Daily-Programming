import java.util.*;
class Accenture_Program1 {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int k=obj.nextInt();
        int[] ar1=new int[n];
        int[] ar2=new int[n];
        for(int i=0;i<n;i++){
            ar1[i]=obj.nextInt();
        }
        for(int i=0;i<n;i++){
            ar2[i]=obj.nextInt();
        }
        System.out.println(MarkValidation(n,k,ar1,ar2));
    }
    public static String MarkValidation(int n,int k,int[] ar1,int[] ar2){
        int sum=0;
        Integer[] diff=new Integer[n];
        for(int i=0;i<n;i++){
            diff[i]=ar2[i]-ar1[i];
        }
        Arrays.sort(diff,Collections.reverseOrder());
        for(int i=0;i<k;i++){
            sum+=diff[i];
        }
        if(sum>=35)
            return "Qualified "+sum;
        else
            return "Disqualified "+sum;
    }
}
/*
5
3
5 10 15 20 25
10 20 30 40 50
Qualified 60
 */