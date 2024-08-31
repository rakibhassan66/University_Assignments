import java.util.Scanner;

class Student {
    String name;
    int age;
    double cgpa;

    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        
        Student student1 = new Student();
        System.out.print("Enter name of student1: ");
        student1.name = tr.nextLine();
        System.out.print("Enter age of student1: ");
        student1.age = tr.nextInt();
        System.out.print("Enter CGPA of student1: ");
        student1.cgpa = tr.nextDouble();
        tr.nextLine(); 
        
        Student student2 = new Student();
        System.out.print("Enter name of student2: ");
        student2.name = tr.nextLine();
        System.out.print("Enter age of student2: ");
        student2.age = tr.nextInt();
        System.out.print("Enter CGPA of student2: ");
        student2.cgpa = tr.nextDouble();
        
        System.out.printf("Details of student1:\nName: %s\nAge: %d\nCGPA: %.2f\n",
        student1.name, student1.age, student1.cgpa);
        
        System.out.printf("Details of student2:\nName: %s\nAge: %d\nCGPA: %.2f\n",
        student2.name, student2.age, student2.cgpa);
    }
}
