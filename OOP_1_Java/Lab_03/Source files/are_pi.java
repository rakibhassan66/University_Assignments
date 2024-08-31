import java.util.Scanner;

public class are_pi {
    public static void main(String[] args) {
        Scanner iu = new Scanner(System.in);
        System.out.print("Insert radius value : ");
        double er = iu.nextDouble();
        System.out.println("The area of a circle is : "+Math.PI*Math.sqrt(er));
    }
}
