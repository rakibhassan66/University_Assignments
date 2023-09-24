
package Lab_07;


public class Phonebook {
    
    private String name,email;
    private int phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    void d(){
    
        System.out.println(getName());
        System.out.println(getEmail());
        System.out.println(getPhone());
        
    }
    
}
