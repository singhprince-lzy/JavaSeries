package pkg;

//package com.stackroute.oops.library.model;

/**
 * @Author Neha
 * @Date 08-Apr-22
 */

import java.io.Serializable;

/**
 * This class contains five fields bookId, genre
 * It is a subclass of Comparable interface
 */

public class BookGenre implements Comparable{



    //Parameterized Constructor to initialize all properties
	String BookId,genere;
	public void BookGenre(String BookId,String genere){
		this.BookId=BookId;
		this.genere=genere;
	}
    /*
    Getter and setter for all properties
     */
	 public void setValues(String BookId,String gnere){
		 this.BookId=BookId;
		 this.genere=genere;
	 }

	 public String getBookId(){
		return this.BookId;
	 }

	 public String getBookGenere(){
		 return this.genere;
	 }

    /**
     * This overridden method should return book details in below format
     * Book{bookId=xxxxx, genre=xxxxxx}
     */

    @Override
    public String toString() {
        return "Book{bookId="+this.BookId+", genere="+this.genere+"}";
    }

    //Overridden compareTo method based on bookId
    public int compareTo(Object object) {
        Book b=(Book)object;
		if(this.getBookId()==b.bookId){
			return 1;
		}
        return 0;
    }
}
