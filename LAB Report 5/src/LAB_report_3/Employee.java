package LAB_report_3;

public class Employee {

    private String name;
    private String id;
    private int age;
    private double salary;


    public void setEmpNameId(String empName, String empId) {
        this.name = empName;
        this.id = empId;
    }

    public void setEmpAge(int empAge) {
        this.age = empAge;
    }

    public void setEmpSalary(double empSalary) {
        this.salary = empSalary;
    }

    public void display_Info() {
        System.out.println("Employee Information:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Create instances of the Employee class
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();

        employee1.setEmpNameId("Nadim Kaka", "1");
        employee1.setEmpAge(30);
        employee1.setEmpSalary(50000.0);

        employee2.setEmpNameId("Sovan Mama", "2");
        employee2.setEmpAge(25);
        employee2.setEmpSalary(60000.0);

        employee3.setEmpNameId("Dhoren Dada", "3");
        employee3.setEmpAge(35);
        employee3.setEmpSalary(75000.0);

        employee1.display_Info();
        System.out.println();
        employee2.display_Info();
        System.out.println();
        employee3.display_Info();
    }
}

