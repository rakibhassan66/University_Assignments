import java.util.Scanner;

public class min_maz {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.println("Place your 3 int data one by one");
        int er=sd.nextInt();
        int ar=sd.nextInt();
        int cr=sd.nextInt();
        int max =Math.max(er, Math.max(ar,cr));
        int min =Math.min(er, Math.max(ar,cr));
        System.out.printf("Maximum Data is %d \n Minimum Data is %d",max,min);
    }
}
