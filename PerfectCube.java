import java.util.Scanner;

public class PerfectCube {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int cubeRoot = 1;
        while (cubeRoot * cubeRoot * cubeRoot <= num) {
            if (cubeRoot * cubeRoot * cubeRoot == num) {
                System.out.println(num + " is a perfect cube.");
                scanner.close();
                return;
            }
            cubeRoot++;
        }

        System.out.println(num + " is not a perfect cube.");
        scanner.close();
    }
}
