package cest.edu.br.LIVRO;

public class Book {
	
	private String author;
	private String edition;
	private String volume;

	public Book(String bookAuthor, String bookEdition, String bookVolume) {
		this.author = bookAuthor;
		this.edition = bookEdition;
		this.volume = bookVolume;
	}
	
	// getters
	public String getAuthor(){
		return author;
	}
	public String getEdition(){
		return edition;
	}
	public String getVolume(){
		return volume;
	}
	
	// setters
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	
}
