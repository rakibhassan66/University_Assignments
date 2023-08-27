import java.util.Scanner;

public class information {
    public static void main(String[] args) {
        Scanner ji = new Scanner(System.in);
        System.out.println("Please insert your depertemnt :");
        String gt = ji.nextLine();
        System.out.println("Please insert Batch & Section :");
        String ft = ji.nextLine();
        System.out.println("Please insert your CGPA :");
        Float ct = ji.nextFloat();
        System.out.println("Please insert your Age:");
        int pt = ji.nextInt();
        System.out.printf("You are %d years old\nFrom %s\nDepartment of %s\nYour CGPA is : %.2f",pt,ft,gt,ct);
    }
}
