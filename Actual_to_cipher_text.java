import java.util.*;
  class CipherText{
    public static void main(String[] args){
      Scanner obj=new Scanner(System.in);
      String st=obj.nextLine();
      int b;
      for(int i=0;i<st.length();i++){
        char a=st.charAt(i);
        if(a=='v')
          System.out.print("a");
        if(a=='w')
          System.out.print("b");
        if(a=='x')
          System.out.print("c");
        if(a=='y')
          System.out.print("d");
        if(a=='z')
          System.out.print("e");
        b=(int)a+5;
        if(b>=80&&b<=122)
          System.out.print((char)b);
      }
    }
  }
