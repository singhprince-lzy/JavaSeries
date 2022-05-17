package pkg;

//package com.stackroute.oops.library.service;

/**
 * @Author Neha
 * @Date 08-Apr-22
 */

//import com.stackroute.oops.library.exception.BookNotFoundException;
//import com.stackroute.oops.library.model.Book;
//import com.stackroute.oops.library.model.BookGenre;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * This class implements the BookGenreService interface
 * This class has three private fields bookGenreSet, bookService
 */
public class BookGenreServiceImpl implements BookGenreService{
    /**
     *Constructor to initialize an empty TreeSet and BookService object
     */
	 public BookGenreServiceImpl(){
		TreeSet<BookGenre> bgt=new TreeSet<BookGenre>();
		BookService bs=new BookService() {
			
			@Override
			public List<Book> getAllBooks(String fileName) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Book findBook(String bookId, String fileName) throws BookNotFoundException {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean addBook(Book book, String filename) throws BookAlreadyExistsException {
				// TODO Auto-generated method stub
				return false;
			}
		};
	 }

  
    @Override
    public boolean addBookToGenre(Book book, String genreFileName, String bookFileName) {
		
		if(book.genere==null){
			return false;
		}
		Book b= new Book();
	 	if(( b=bs.findBook(book.getBookId(),"book.csv"))==null){
			throw new BookNotFoundException();
		}
		if(bs.findBook(book.getBookId(),"book.csv")){
			throw new BookAlreadyExistsException();
		}
		BufferedReader br=new BufferedReader(new FileReader(genreFileName));
		String line=null;
		while((line=br.readLine())!=null){
			String arr[]=line.split(",");
			if(book.getBookId()==arr[0] && book.getBookGenere()==arr[4]){
				return true;
			}
		}
		
        return false;
    }

    //Return the set of all BookGenre by reading the file content from "genre.csv" file

    @Override
    public Set<BookGenre> getAllBookGenres(String fileName) {
		BufferedReader br1=new BufferedReader(new FileReader(fileName)){
			String line=null;
			while ((line = br1.readLine()) != null) {
                String[] arr = line.split(",");
				BookGenere bg=new BookGenere();
				bg.setValues(arr[0],arr[1]);
				bgt.add(bg);
			}
        return bgt;
	
        
    }


     /*
   Returns the set of bookGenre belonging to a particular genre
   one can get to know about bookGenre and their corresponding genre by "genre.csv" file
    */

    @Override
    public Set<BookGenre> getBookSetByGenre(String genre, String fileName) {
		Set<BookGenere>set=new TreeSet<BookGenere>();
		BufferedReader br1=new BufferedReader(new FileReader(fileName)){
			String line=null;
			while ((line = br1.readLine()) != null) {
                String[] arr = line.split(",");
				if(genere==arr[1]){
					BookGenere bg=new BookGenere();
					bg.setValues(arr[0],arr[1]);
					set.add(bg);
				}
				
			}
        return set;
    }
}
