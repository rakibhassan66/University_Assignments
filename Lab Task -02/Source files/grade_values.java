import java.util.Scanner;

public class grade_values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your obtained marks (4.00 to 0.00):");
        float grade = scanner.nextFloat();

        if (grade >= 4.00) System.out.println("A+ (Outstanding)");
        else if (grade >= 3.76) System.out.println("A (Excellent)");
        else if (grade >= 3.51) System.out.println("A- (Very Good)");
        else if (grade >= 3.26) System.out.println("B+ (Good)");
        else if (grade >= 3.01) System.out.println("B (Satisfactory)");
        else if (grade >= 2.76) System.out.println("B- (Above Average)");
        else if (grade >= 2.51) System.out.println("C+ (Average)");
        else if (grade >= 2.26) System.out.println("C (Below Average)");
        else if (grade >= 1.50) System.out.println("D (Pass)");
        else System.out.println("F (Fail)");
    }
}
