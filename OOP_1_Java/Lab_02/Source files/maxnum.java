import java.util.Scanner;

public class maxnum {
    public static void main(String[] args) {
        Scanner er = new Scanner(System.in);
        System.out.println("Please insert your 1st number ");
        int de = er.nextInt();
        System.out.println(" insert your 2nd number ");
        int ne = er.nextInt();
        System.out.println(" insert your 3rd number ");
        int kha = er.nextInt();
        int max = Math.max(de ,Math.max(ne, kha));
        System.out.println("Maximux number is "+max);
    }
}
