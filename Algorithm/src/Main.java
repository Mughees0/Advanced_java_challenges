import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<> ();
		books.add(new Book ("The Shawshank Redemption", "Drama", "Frank Darabont", 1994));
		books.add(new Book ("The Godfather", "Crime", "Francis Ford Coppola", 1972));
		books.add(new Book ("The Dark Knight", "Action", "Christopher Nolan", 2008));
		books.add(new Book ("The Lord of the Rings: The Fellowship of the Ring", "Fantasy", "Peter Jackson", 2001));
		books.add(new Book ("Harry Potter and the Philosopher's Stone", "Fantasy", "J.K. Rowling", 1997));
		
		List<String> preferredGenres = new ArrayList<>();
		List<String> preferredAuthors = new ArrayList<>();
		int minReleaseYear = 0;
		
		Scanner scanner = new Scanner (System.in);
		
		while(true){
			System.out.println("Select option : \n 1.Genre \n 2.Author \n 3.Published Date \n 0.Search Now");
			int innerOption = scanner.nextInt ();
		if (innerOption == 1 ){
			System.out.println("Select genre : \n 1.Fantasy \n 2.Adventure \n 0.Search Now");
			int genreOption = scanner.nextInt ();
			if (genreOption == 1){
				preferredGenres.add("Fantasy");
			} else if (genreOption == 2) {
				preferredGenres.add("Adventure");
			} else if (genreOption == 0) {
				break;
			}
		} else if (innerOption == 2 ){
			System.out.println("Select Author : \n 1.Peter Jackson \n 2.Francis Ford Coppola \n 0.Search Now");
			int genreOption = scanner.nextInt ();
			if (genreOption == 1){
				preferredAuthors.add("Peter Jackson");
			} else if (genreOption == 2) {
				preferredAuthors.add("Francis Ford Coppola");
			} else if (genreOption == 0) {
				break;
			}
		} else if (innerOption == 3 ){
			System.out.println("Select Min Published date : \n 1.1990 \n 2.2000 \n 3.2010 \n 0.Search Now");
			int genreOption = scanner.nextInt ();
			if (genreOption == 1){
				minReleaseYear = 1990;
			} else if (genreOption == 2) {
				minReleaseYear = 2000;
			} else if (genreOption == 3) {
				minReleaseYear = 2010;
			} else if (genreOption == 0) {
				break;
			}
		} else if (innerOption == 0) {
			break;
		}
		} ;
		
		List<Book> recommendations = new ArrayList<>();
		for (Book book : books) {
			if (preferredGenres.contains(book.genre)&& preferredAuthors.contains(book.directorAuthor) && book.releaseYear >= minReleaseYear) {
				recommendations.add(book);
			} else if (preferredGenres.contains(book.genre)) {
				recommendations.add(book);
			} else if (preferredAuthors.contains(book.directorAuthor)) {
				recommendations.add(book);
			} else if (book.releaseYear >= minReleaseYear) {
				recommendations.add(book);
			} else {
				recommendations.add (book);
			}
		}
		
		System.out.println("Results :");
		for (Book book : recommendations) {
			System.out.println(book);
		}
	}
}
