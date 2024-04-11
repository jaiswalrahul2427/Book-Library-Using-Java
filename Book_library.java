class Library {
    String[] books;
    int no_of_books;
    
    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }
    
    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added.");
    }
    
    void ShowAvailableBooks() {
        System.out.println("\nAvailable books are:");
        for (String book : books) {
            if (book == null) {
                break;
            } else {
                System.out.println("* " + book);
            }
        }
    }

    void issueBook(String book) {
        boolean bookFound = false;
        for (String b : books) {
            if (b != null && b.equals(book)) {
                bookFound = true;
                System.out.println("\nBook issued: " + book);
                break;
            }
        }
        if (!bookFound) {
            System.out.println("\nBook is not available: " + book);
        }
    }
}

public class Book_library {
    public static void main(String[] args) {
        Library centerLibrary = new Library();
        centerLibrary.addBook("Think is Great then Do");
        centerLibrary.addBook("Great To Do");
        centerLibrary.addBook("Do for become Great");
        centerLibrary.ShowAvailableBooks();
        centerLibrary.issueBook("Great To Do");
    }
}
