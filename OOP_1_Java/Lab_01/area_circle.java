import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        Scanner del = new Scanner(System.in);
        float result, area;
        System.out.println("Please insert the radius as float values");
        area = del.nextFloat();
        result = (float) (3.1416 * area);
        System.out.printf("The area of the circle is %.2f", result);
    }
}
