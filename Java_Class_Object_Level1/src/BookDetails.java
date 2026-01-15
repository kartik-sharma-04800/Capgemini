public class BookDetails {

    String title;
    String author;
    double price;

    public BookDetails(String title,String author,double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails()
    {
        System.out.println("Book Title : "+title);
        System.out.println("Book Author : "+author);
        System.out.println("Book Price : "+price);
    }

    public static void main(String[] args) {

        BookDetails bookDetails = new BookDetails("Inception","XYZ",1200);

        bookDetails.displayDetails();


    }

}
