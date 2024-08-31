import java.util.Scanner;

public class multable {
    public static void main(String[] args) {
        Scanner it = new Scanner(System.in);
        System.out.print("Plese inset number  :");
        int me = it.nextInt();
        for (int rt=1;rt<=10;rt++ )
        {
            int res=me*rt;
            System.out.println(me + " * " + rt + " = " + res);
        }
    }
}
