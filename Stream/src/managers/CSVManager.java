package managers;

import models.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CSVManager {
	List<Book> books = new ArrayList<Book>();
	
	public List<Book> readCsvFile(String filePath) {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while((line = br.readLine()) != null){
				String[] values = line.split(",");
				String title = values[1];
				String author= values[2];
				int publishedYear = Integer.parseInt(values[3]);
				books.add(new Book(title,author,publishedYear));
			}
		}catch(IOException e){
		 	e.printStackTrace();
		}
		return books;
	};
	
	public List<Book> filterByAuthor(String author){
		return books.stream().filter(book -> book.getAuthor().equals(author)).toList();
	};
	
	public List<Book> sortByPublishedYear(){
		return books.stream().sorted(Comparator.comparing(book -> book.getPublishedYear())).toList();
	};
	
	public List<Book> sortByAuthor(){
		return books.stream().sorted(Comparator.comparing(book -> book.getAuthor())).toList();
	};
	
	public List<Book> sortByTitle(){
		return books.stream().sorted(Comparator.comparing(book -> book.getTitle())).toList();
	};
	
	public List<Book> getBooks() {
		return books;
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
	
}
