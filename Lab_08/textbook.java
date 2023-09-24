
package Lab_08;

public class textbook extends Book {
    
    private String subject;

    public textbook(String title, String author, int isbn, String subject) {
        super(title, author, isbn);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public static void main(String[] args) {
        Book b1= new Book("The lala land","Vinsing Porta",8958);
        b1.di1();
        textbook t1 = new textbook("Philosophy", "John Doe", 9876, "Ph");
        System.out.println("Subject: " + t1.getSubject());
    }

    
    
}
