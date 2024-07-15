import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    int num=obj.nextInt();
    int[] arr=new int[num];
    int i,j;
    for(i=0;i<num;i++){
      arr[i]=obj.nextInt();
    }
  Arrays.sort(arr);
  for(int n:arr){
    System.out.print(n);
  }
}
}
