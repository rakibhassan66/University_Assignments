import java.util.Scanner;

public class mathclass1 {
    public static void main(String[] args) {
        Scanner ver = new Scanner(System.in);

        System.out.print("Insert your number: ");
        double number = ver.nextDouble();


        double abs = Math.abs(number);
        System.out.printf("Absolute value: \n", abs);


        double floor = Math.floor(number);
        System.out.printf("Floor value: %.3f \n" , floor);


        double ceil = Math.ceil(number);
        System.out.printf("Ceiling value: %.3f \n" , ceil);


        long rd = Math.round(number);
        System.out.printf("Rounded value: %d \n" ,rd);


        double sq = Math.sqrt(number);
        System.out.printf("Square root value: %.3f ", sq);

    }
}
