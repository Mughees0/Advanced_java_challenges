package models;

public class Book {
	String title;
	String author;
	int publishedYear;
	
	
	public Book(String title, String author, int publishedYear){
		this.author= author;
		this.publishedYear= publishedYear;
		this.title= title;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getPublishedYear() {
		return publishedYear;
	}
	
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	
	@Override
	public String toString() {
		return title + " by " + author + " (" + publishedYear + ")";
	}
}
