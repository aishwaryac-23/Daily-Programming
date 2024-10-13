import java.util.*;
class Island {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();//sweet pieces
        int e = obj.nextInt();// daily sweets
        int d = obj.nextInt();//total days
        System.out.println(coconutSweetBoxes(n, e, d));
    }

    public static int coconutSweetBoxes(int n, int e, int d) {
        int sundays = d / 7;
        int effective_days = d - sundays;
        int total_sweets_required = e * d;
        int total_sweets_available = n * effective_days;

        if (total_sweets_required > total_sweets_available) {
            return -1;
        }

         else return(int) Math.ceil((double) total_sweets_required / n);
    }
}
/*
Example:
Input:
16
2
10
Output:
2

Input
50
48
7
Output:
-1
 */