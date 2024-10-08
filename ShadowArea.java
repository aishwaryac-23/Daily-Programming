import java.util.*;
class ShadowArea {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int d=obj.nextInt();
        double area=((3.14)*d*d);
        System.out.println((int)(Math.ceil(area)));
    }
}
/*
Input:5
Output:79
 */