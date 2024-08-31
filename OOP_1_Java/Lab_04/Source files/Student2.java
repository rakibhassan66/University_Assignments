import java.util.Scanner;

class Student2 {
    String name;
        int age;
        double cgpa;
    public static void main(String[] args) {
        
        Scanner tr = new Scanner(System.in);
        
        Student2 student1 = new Student2();
        System.out.print("Enter name of student1: ");
        student1.name = tr.nextLine();
        System.out.print("Enter age of student1: ");
        student1.age = tr.nextInt();
        System.out.print("Enter CGPA of student1: ");
        student1.cgpa = tr.nextDouble();
        tr.nextLine(); 
        
        Student2 student2 = new Student2();
        System.out.print("Enter name of student2: ");
        student2.name = tr.nextLine();
        System.out.print("Enter age of student2: ");
        student2.age = tr.nextInt();
        System.out.print("Enter CGPA of student2: ");
        student2.cgpa = tr.nextDouble();
        
        Student2 student3 = new Student2();
        System.out.print("Enter name of student3: ");
        student2.name = tr.nextLine();
        System.out.print("Enter age of student3: ");
        student2.age = tr.nextInt();
        System.out.print("Enter CGPA of student3: ");
        student2.cgpa = tr.nextDouble();
        
        System.out.printf("Details of student1:\nName: %s\nAge: %d\nCGPA: %.2f\n",
        student1.name, student1.age, student1.cgpa);
        
        System.out.printf("Details of student2:\nName: %s\nAge: %d\nCGPA: %.2f\n",
        student2.name, student2.age, student2.cgpa);

        System.out.printf("Details of student3:\nName: %s\nAge: %d\nCGPA: %.2f\n",
        student3.name, student3.age, student3.cgpa);
    }
}
