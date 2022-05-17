package pkg;

import java.io.*;
import java.util.*;


public class BookServiceImpl implements BookService{
    /**
     * Constructor to initialize an empty ArrayList for bookList
     */
	public BookServiceImpl(){
		ArrayList <Book>bookList=new ArrayList<Book>();
	}


    /**
     * addBook has to return true if book object is stored in "books.csv" as comma separated fields successfully
     * proceed to store book details in books.csv only when bookAuthor length is greater than six and bookValue is greater than 100
     * addBook has to return false if any of above condition doesn't match
     * throw BookAlreadyExistsException if baller with same bookId already exist
     */

    @Override
    public boolean addBook(Book book, String fileName) throws BookAlreadyExistsException{
		BookServiceImpl bsi=new BookServiceImpl();
    	if(bsi.findBook(book.getBookId(),fileName)!=null){
			return true;
		}
		else if(book.getBookAuthor().length()>6 && book.getBookValue()>100){
			
        	try(FileWriter fw = new FileWriter("book.csv")){
            	fw.write(book.toString());
        	} catch (IOException e) {
            e.printStackTrace();   }
			}
        return false;
    }

    /**
     * Return Book object given bookId to search
     * Throw BookNotFoundException if book with bookId doesn't match with any book
     */

    @Override
    public Book findBook(String bookId, String fileName) {
		BufferedReader br1=new BufferedReader(new FileReader(fileName))
			String line=null;
			while ((line = br1.readLine()) != null) {
                String[] arr = line.split(",");
				if(bookId==arr[0]){
					Book b= new Book();
					b.setValues(arr[0],arr[1],arr[2],Integer.parseInt(arr[3]),arr[4]);
					return b;
				}
			}
        return null;
    }

    /**
    Return the list of book objects by reading data from the file "book.csv"
     */

    @Override
    public List<Book> getAllBooks(String fileName) {
		List <Book> bk= new ArrayList<Book>();
		BufferedReader br1=new BufferedReader(new FileReader(fileName))
			String line=null;
			while ((line = br1.readLine()) != null) {
                String[] arr = line.split(",");
				Book b= new Book();
				b.setValues(arr[0],arr[1],arr[2],arr[3],arr[4]);
				bk.add(b);
			}
        return bk;
    }


}
