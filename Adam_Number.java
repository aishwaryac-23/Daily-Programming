import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner obj = new Scanner(System.in);
      long num=obj.nextLong();
      long c=squareNumber(num);
      long a=num;
      long d=reverse(a);
      long e=squareNumber(d);
      long h=reverse(e);
      if(c==h)
        System.out.println("Adam Number");
      else
        System.out.println("Not Adam");
    }
    public static long reverse(long num) {
        long revNum = 0;
        while (num != 0) {
            long digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        
        return revNum;
    }
    public static long squareNumber(long num) {
        return num * num;
    }
}
