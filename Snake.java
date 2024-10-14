
import java.util.*;
class Snake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0;
        int n=sc.nextInt();
        String str=sc.next();
        String a="";
        for(int k=0;k<str.length();k++)
        {
            char c=str.charAt(k);
            if(c=='w'||c=='s'||c=='g')
                a=a+c;
        }
        char c[]=a.toCharArray();
        for(int i=0;i<c.length-1;i+=2)
        {
            if(c[i]=='s'&&c[i+1]=='w')
                x++;
            else if(c[i]=='w'&&c[i+1]=='g')
                x++;
            else if(c[i]=='g'&&c[i+1]=='s')
                x++;
        }
        System.out.print(x);
    }
}
