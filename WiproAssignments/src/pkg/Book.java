package pkg;



/**
 * @Author Neha
 * @Date 08-Apr-22
 */

/**
 * This class contains five fields bookId, bookName, bookAuthor, bookValue and genre
 * It is a subclass of Comparable interface
 */

public class Book {

	
    //Parameterized Constructor to initialize bookId, bookName, bookAuthor, bookValue properties
	String bookId,bookName,bookAuthor,genere;
	int bookValue;
    //Parameterized Constructor to initialize bookId, bookName, bookAuthor, bookValue properties
	public Book(String bookId,String bookName,String bookAuthor, int bookValue){
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		this.bookValue=bookValue;
	}
    
	/*
    Getter for all bookId, bookName, bookAuthor, bookValue and genre
     */
	public String getBookId(){
		return this.bookId;
	}
	public String getBookName(){
		return this.bookName;
	}
	public String getBookAuthor(){
		return this.bookAuthor;
	}
	public int getBookValue(){
		return this.bookValue;
	}
	public String getBookGenere(){
		return this.genere;
	}

    /*
    Setter for genre property
     */
	public void setGenere(String g){
		this.genere=g;
	}
    /**
     * This overridden method should return book details in below format
     * Book{bookId=xxxxx, bookName=xxxxxx, bookAuthor=xxxxxx,book value=xxxxxxxx, genre=xxxxx}-> if genre is set
     * Book{bookId=xxxxx, bookName=xxxxxx, bookAuthor=xxxxxx,book value=xxxxxxxx}-> if genre is not set
     */

    @Override
    public String toString() {
		if(genere!=null){
			return "Book{bookId="+this.bookId+", bookName="+this.bookName+",bookAuthor="+this.bookAuthor+",book value="+this.bookValue+", genre="+this.genere+"}";
		}
		return "Book{bookId="+this.bookId+", bookName="+this.bookName+",bookAuthor="+this.bookAuthor+",book value="+this.bookValue+"}";
    }

    //compareTo book object based on bookId
    public int compareTo(Object object) {
		Book b=(Book)object;
		if(this.bookId==b.bookId){
			return 1;
		}
        return 0;
    }


}
