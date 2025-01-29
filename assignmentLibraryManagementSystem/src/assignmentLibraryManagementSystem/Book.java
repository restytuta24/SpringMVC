package assignmentLibraryManagementSystem;

public class Book {
	
	    private String title;
	    private String author;
	    private String category;
	    private String ISBN;

	    public Book(String title, String author, String category, String ISBN) {
	        this.title = title;
	        this.author = author;
	        this.category = category;
	        this.ISBN = ISBN;
	    }

	    // Getters and setters
	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public void setCategory(String category) {
	        this.category = category;
	    }

	    public String getISBN() {
	        return ISBN;
	    }

	    public void setISBN(String ISBN) {
	        this.ISBN = ISBN;
	    }

	    // Method to display book details
	    public void displayBookDetails() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Category: " + category);
	        System.out.println("ISBN: " + ISBN);
	    }
	    
	    // to String method
	    public String toString() {
	        return "BookTitle" + " : " + title + "Author" + " : " + author + "Book Category" + " : " + category + "Book unique identifier" + " : " + ISBN;
	    }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
