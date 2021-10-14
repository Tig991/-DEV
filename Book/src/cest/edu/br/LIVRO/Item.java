package cest.edu.br.LIVRO;

public class Item {
	
	private String title;
	private String publisher;
	private String year_publisher;
	private String isbn;

	
	public Item(String bookTitle, String bookPublisher, String book_year, String bookIsbn) { 
		
		this.title = bookTitle;
		this.publisher = bookPublisher;
		this.year_publisher = book_year;
		this.isbn = bookIsbn;
	}
	
	// getters
	public String getTitle() {
		return this.title;
	}
	
	
	public String getPublisher() {
		return this.publisher;
	}
	
	
	public String getYear_publisher() {
		return this.isbn;
	}
	
	public String getIsbn( ) {
		return this.isbn;
	}
	
	//setters
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setYear_publisher(String year_publisher) {
		this.year_publisher = year_publisher;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}	
}
