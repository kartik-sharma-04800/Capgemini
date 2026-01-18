public class Book {
    private static String libraryName = "City Central Library";
    
    private final String isbn;
    private String title;
    private String author;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }
    
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
    
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", "978-1234567890");
        Book book2 = new Book("Data Structures", "Mary Johnson", "978-0987654321");
        
        displayLibraryName();
        
        if (book1 instanceof Book) {
            book1.displayDetails();
        }
        
        if (book2 instanceof Book) {
            book2.displayDetails();
        }
    }
}
