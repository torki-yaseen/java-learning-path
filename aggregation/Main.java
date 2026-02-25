package aggregation;

public class Main {
    /*
    Aggregation = Represents a "has-a" relationship between objects. One object contains another object as part of its structure. But the contained object/s can exist independently
     */
    public static void main(String[] args) {
    Book book1 = new Book("One up to wall street", 1990);
    Book book2 = new Book("Random walk down wall street", 1972);
    Book book3 = new Book("Irrational exuberant ", 1995);

    // create array of objects
        Book[] books = {book1, book2, book3};
    // create Library
        Library library = new Library("General public library", 2000, books);
    library.ShowDetails();

    }
}
