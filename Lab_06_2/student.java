
package Lab_06_2;


public class student {
    
     private String name;
    private int  id;
    private double cgpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    
    
    
    void displayRecord(){
    
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("CGPA : "+cgpa);
        
    }
    
}
