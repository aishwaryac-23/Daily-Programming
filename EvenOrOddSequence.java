import java.util.*;
class EvenOrOddSequence {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println(Sequence(arr,n));
    }
    public static String Sequence(int arr[],int n){
        StringBuilder st=new StringBuilder();
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                st.append("Even");
            }
            else{
                st.append("Odd");
            }
        }
        return st.toString();
    }
}
/*
4
1 2 2 3
OddEvenEvenOdd
 */