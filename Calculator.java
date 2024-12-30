import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = sc.next().charAt(0);

        double result = 0;
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': 
                if (num2 != 0) result = num1 / num2; 
                else System.out.println("Division by zero is not allowed.");
                break;
            default: System.out.println("Invalid operator!"); break;
        }

        System.out.println("Result: " + result);
    }
}
