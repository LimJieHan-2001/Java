public class Book {
    private String title;
    private String author;
    private String isbn;
    private double price;

    // Constructor
    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        // Creating instances of books
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084", 10.99);
        Book book2 = new Book("1984", "George Orwell", "978-0451524935", 9.99);

        // Setting attributes
        book1.setPrice(12.99);
        book2.setAuthor("George Orwell (pen name)");

        // Displaying book information
        System.out.println("Book 1 Information:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("ISBN: " + book1.getIsbn());
        System.out.println("Price: $" + book1.getPrice());

        System.out.println("\nBook 2 Information:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("ISBN: " + book2.getIsbn());
        System.out.println("Price: $" + book2.getPrice());
    }
}
