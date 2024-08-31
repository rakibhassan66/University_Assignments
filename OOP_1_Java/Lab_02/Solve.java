import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert value for A: ");
        int A = scanner.nextInt();
        System.out.print("Please insert value for B: ");
        int B = scanner.nextInt();
        System.out.print("Please insert value for C: ");
        int C = scanner.nextInt();
        System.out.print("Please insert value for D: ");
        int D = scanner.nextInt();
        float a = (A * B - C * D);
        float b = (2 * A - B + 3 * D);
        float c = (A * A + B * B - C * C + D * D);
        float d = (A * A * A + B - C * C);
        System.out.println("Solution of Equation - 1: " + a);
        System.out.println("Solution of Equation - 2: " + b);
        System.out.println("Solution of Equation - 3: " + c);
        System.out.println("Solution of Equation - 4: " + d);
        scanner.close();
    }
}
