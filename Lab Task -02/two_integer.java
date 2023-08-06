import java.util.Scanner;

public class two_integer {

    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.println("Please insert your first digit : ");
        int to = ui.nextInt();
        System.out.println("Please insert your second digit : ");
        int el = ui.nextInt();
        System.out.println("The sum of your insertion is : "+(to+el));
    }
}