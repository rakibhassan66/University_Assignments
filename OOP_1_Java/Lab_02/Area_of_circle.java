import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner oi = new Scanner (System.in);
        System.out.println("For total area of circle you need to insert the radius value\nThe radius value is :");
        float el = oi.nextFloat();
        float result = (float) (3.1416)*(el*el);
        System.out.printf("The Are of circle is %.2f : ",result);
    }
}
