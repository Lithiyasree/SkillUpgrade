import java.io.Serializable;


class Book implements Serializable {
    private String title;
    private String author;
    private boolean isBorrowed;
    private String borrowedBy;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
        this.borrowedBy = null;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook(String patronName) {
        if (!isBorrowed) {
            isBorrowed = true;
            borrowedBy = patronName;
        }
    }

    public void returnBook() {
        isBorrowed = false;
        borrowedBy = null;
    }

    public String getBorrowedBy() {
        return borrowedBy;
    }
}
