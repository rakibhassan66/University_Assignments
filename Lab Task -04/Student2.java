import java.util.Scanner;

class Student2 {
    String name;
        int age;
        double cgpa;
    public static void main(String[] args) {
        
        Scanner tr = new Scanner(System.in);  

        System.out.print("Enter name of student 1\nName\nAge\nCGPA: ");

        Student2 student1 = new Student2();
        student1.name = tr.nextLine();
        student1.age = tr.nextInt();
        student1.cgpa = tr.nextDouble();
        
        System.out.print("Enter name of student 2\nName\nAge\nCGPA: ");
        Student2 student2 = new Student2();
        student2.name = tr.nextLine();
        student2.age = tr.nextInt();
        student2.cgpa = tr.nextDouble();
        
        System.out.print("Enter name of student 3\nName\nAge\nCGPA: ");
        Student2 student3 = new Student2();
        student3.name = tr.nextLine();
        student3.age = tr.nextInt();
        student3.cgpa = tr.nextDouble();
    }
}
