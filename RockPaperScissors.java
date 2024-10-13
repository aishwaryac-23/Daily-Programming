import java.util.*;
class RockPaperScissors {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String st=obj.next();
        System.out.println(check(st));
    }
    public static String check(String st){
        char c=st.charAt(0);
        if(c=='r')
            return "paper";
        else if (c=='s')
            return "rock";
        else
            return "scissors";
    }
}
