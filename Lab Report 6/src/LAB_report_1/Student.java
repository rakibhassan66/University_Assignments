package LAB_report_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String name;
    private int id;
    private double cgpa;

    private static final ArrayList<Student> studentList = new ArrayList<>();

    public void insert(String studentName, int studentId, double studentCgpa) {
        Student student = new Student();
        student.name = studentName;
        student.id = studentId;
        student.cgpa = studentCgpa;
        studentList.add(student);
    }

    public void display() {
        System.out.println("Student List:");
        for (Student student : studentList) {
            System.out.println("Name: " + student.name + ", ID: " + student.id + ", CGPA: " + student.cgpa);
        }
    }

    public Student search(String key) {
        for (Student student : studentList) {
            if (student.name.equalsIgnoreCase(key) || String.valueOf(student.id).equalsIgnoreCase(key)) {
                return student;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();


        student.insert("John Doe", 1, 3.5);
        student.insert("Jane Smith", 2, 3.8);
        student.insert("Bob Johnson", 3, 4.0);

        student.display();

        System.out.print("\nEnter the name or ID to search: ");
        String searchKey = scanner.nextLine();
        Student foundStudent = student.search(searchKey);


        if (foundStudent != null) {
            System.out.println("\nStudent found:");
            System.out.println("Name: " + foundStudent.name + ", ID: " + foundStudent.id + ", CGPA: " + foundStudent.cgpa);
        } else {
            System.out.println("\nStudent not found.");
        }


    }
}
