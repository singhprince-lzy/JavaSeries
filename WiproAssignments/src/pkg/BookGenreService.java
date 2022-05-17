package pkg;

import java.util.Set;

/**
 * @Author Neha
 * @Date 08-Apr-22
 */

public interface BookGenreService {
    boolean addBookToGenre(Book book, String genreFileName, String bookFileName) throws BookNotFoundException;

    Set<BookGenre> getAllBookGenres (String fileName);

    Set<BookGenre> getBookSetByGenre(String genre, String fileName);
}

