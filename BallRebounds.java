import java.util.*;
class BallRebounds {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int h=obj.nextInt(); //Height
        int v=obj.nextInt(); //Initial Velocity
        int vn=obj.nextInt(); //Final Velocity
        int en;
        en=v/vn;
        h=h*(en*en);
        System.out.println("Height Rebounds : "+h);
    }
}
