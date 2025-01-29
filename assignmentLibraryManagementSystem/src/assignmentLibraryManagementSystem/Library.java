package assignmentLibraryManagementSystem;

import java.util.ArrayList;

public class Library {
		// ArrayList<Book> booksCollection = new ArrayList<Book>();

	// Attribute to store the list of books. Declares a variable named books that can hold an ArrayList of Book objects.
    private ArrayList<Book> books;
    
    // constructor for the arrayList
    public Library () {
    	this.books = new ArrayList();
    
    	}
    public void addBook(Book newBookItem) {
    	books.add(newBookItem);
    }


    public static void main(String[] args) {
    	
    	// In order to use the methods of the Library class, we need to create an instance of the same class.
    	
    	Library libraryBooks = new Library();
    	
    	libraryBooks.addBook(new Book("Deep Work", "Cal Newport", "Productivity", "B01D0JE7KQ"));
    	libraryBooks.addBook(new Book("The Power of Habit ", "Charles Duhigg", "Self-Help", "B007ROERCY"));
    	libraryBooks.addBook(new Book("Becoming", "Michelle Obama", "Inspirational", "B07B3G4PQB"));
    	
    	
	// (String title, String author, String category, String ISBN)
}
}
