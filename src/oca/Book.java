package oca;

public class Book {
	public String title;
	
	public Book(String title) {
		this.title = title;
	}
	
	public Book(Book book){
		this.title = book.getTitle();
	}
    // your code (optional ~ you can avoid it. Depends on your implementation in Instructor)
	
	public Book(){
		//System.out.println("This is no-arg constructor");
	}
	
	public void setBook(int index, Book book) {
		Book bk = new Book(book);
			
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
}
