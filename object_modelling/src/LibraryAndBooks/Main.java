package LibraryAndBooks;

public class Main {

    public static void main(String[] args) {

        Library abc = new Library("ABC");

        abc.addBooks(new Book("Alert","CXY"));
        abc.addBooks(new Book("Main","YZQ"));

        abc.displayBooks();




    }

}
