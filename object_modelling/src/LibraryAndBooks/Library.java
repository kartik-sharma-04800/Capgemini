package LibraryAndBooks;

import java.util.ArrayList;

public class Library {

    String libraryName;

    ArrayList<Book>books = new ArrayList<>();

    public Library(String libraryName)
    {
        this.libraryName = libraryName;
    }

    public void addBooks(Book book)
    {
        books.add(book);
    }

    public void displayBooks()
    {
        for(Book b : books)
        {
            System.out.println("Book Name : "+b.title);
            System.out.println("Book Author : "+b.author);
            System.out.println("===========================================");
        }
    }



}
