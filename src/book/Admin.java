package book;
public class Admin {
    private String adminId;

    public Admin(String adminId) {
        this.adminId = adminId;
    }

    public void addBook(Library library, Book book) {
        library.registerBook(book);
    }

    public void removeBook(Library library, Book book) {
        library.removeBook(book);
    }
}

