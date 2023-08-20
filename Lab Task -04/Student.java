import java.util.Scanner;

class Student {
    String name;
        int age;
        double cgpa;
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);  
        System.out.print("Enter name of student 1\nName\nAge\nCGPA: ");
        Student student1 = new Student();
        student1.name = tr.nextLine();
        student1.age = tr.nextInt();
        student1.cgpa = tr.nextDouble();
        tr.nextLine();
        
        
        System.out.print("Enter name of student 2\nName\nAge\nCGPA: ");
        Student student2 = new Student();
        student2.name = tr.nextLine();
        student2.age = tr.nextInt();
        student2.cgpa = tr.nextDouble();
        tr.nextLine();
    }
}
