package pkg;




public interface BookService {

    boolean addBook(Book book, String filename) throws BookAlreadyExistsException;

    List<Book> getAllBooks(String fileName);

    Book findBook(String bookId, String fileName) throws BookNotFoundException;
}
