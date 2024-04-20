import java.util.*;

public class Library {
    private List<Book> books;
    private List<Patron> patrons;

    public Library() {
        books = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public void removePatron(Patron patron) {
        patrons.remove(patron);
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Patron findPatronByName(String name) {
        for (Patron patron : patrons) {
            if (patron.getName().equalsIgnoreCase(name)) {
                return patron;
            }
        }
        return null;
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void displayPatrons() {
        System.out.println("Patrons in the library:");
        for (Patron patron : patrons) {
            System.out.println(patron);
        }
    }

    public void borrowBook(String title, String patronName) {
        Book book = findBookByTitle(title);
        Patron patron = findPatronByName(patronName);
        if (book != null && patron != null && book.isAvailable()) {
            book.setAvailable(false);
            book.setBorrowedBy(patron);
            System.out.println("Book \"" + title + "\" has been borrowed by " + patronName);
        } else {
            System.out.println("Book not available or patron not found.");
        }
    }

    public void returnBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            book.setBorrowedBy(null);
            System.out.println("Book \"" + title + "\" has been returned.");
        } else {
            System.out.println("Book not borrowed or not found.");
        }
    }
}

