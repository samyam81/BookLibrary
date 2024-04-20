public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    private Patron borrowedBy;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
        this.borrowedBy = null;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public Patron getBorrowedBy() {
        return borrowedBy;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setBorrowedBy(Patron borrowedBy) {
        this.borrowedBy = borrowedBy;
    }

    @Override
    public String toString() {
        if (available) {
            return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: Yes";
        } else {
            return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: No, Borrowed By: " + borrowedBy.getName();
        }
    }
}
