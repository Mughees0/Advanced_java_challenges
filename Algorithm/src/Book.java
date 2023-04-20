class Book {
	String title;
	String genre;
	String directorAuthor;
	int releaseYear;
	
	public Book(String title, String genre, String directorAuthor, int releaseYear) {
		this.title = title;
		this.genre = genre;
		this.directorAuthor = directorAuthor;
		this.releaseYear = releaseYear;
	}
	
	@Override
	public String toString() {
		return "Item [title=" + title + ", genre=" + genre + ", director/author=" + directorAuthor + ", release year=" + releaseYear + "]";
	}
}
