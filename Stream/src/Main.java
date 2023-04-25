import managers.CSVManager;
import models.Book;

import java.util.Comparator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		// Read data from CSV file and store it in a List
		CSVManager books = new CSVManager();
		books.readCsvFile("/Users/mugheessaba/IdeaProjects/Steams/src/books.csv");

//		Using the sorting methods
//		books.sortByTitle().forEach(book -> System.out.println(book));
//		books.sortByPublishedYear().forEach(book -> System.out.println(book));
		books.filterByAuthor("Robert Cowley").forEach(book -> System.out.println(book));
	}
}