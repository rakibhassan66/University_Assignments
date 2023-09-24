package Lab_06;

import java.util.Scanner;

public class test {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        
        
        System.out.print("Please insert your Name: ");
        String name = sc.nextLine();
        s1.setName(name);
        
        System.out.print("Please insert your ID: ");
        int id = sc.nextInt();
        s1.setId(id);
        
        System.out.print("Please insert your CGPA: ");
        double cgpa = sc.nextDouble();
        s1.setCgpa(cgpa);
        
        s1.displayRecord();
        
    }
}
