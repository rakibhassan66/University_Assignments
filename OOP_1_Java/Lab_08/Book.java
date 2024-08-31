package Lab_08;

public class Book {
    
    protected String title, author;
    protected int isbn;
    
    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    void di1(){
    
        System.out.println(getTitle());
        System.out.println(getAuthor());
        System.out.println(getIsbn());
        
    }
}
