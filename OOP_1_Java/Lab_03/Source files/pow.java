import java.util.Scanner;

public class pow {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        System.out.print("Insert base num ");
        int b =tr.nextInt();
        System.out.print("Insert exp num ");
        int exp =tr.nextInt();
        System.out.println("power number is  : "+Math.pow(b, exp));
    }
}
