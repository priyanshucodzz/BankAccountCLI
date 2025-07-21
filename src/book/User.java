package book;
import java.util.ArrayList;
import java.util.List;

public abstract class User {
    protected String userId;
    protected String name;
    protected List<String> borrowedBooks = new ArrayList<>();

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public boolean borrowBook(Book book) {
        if (borrowedBooks.size() < getLimit() && book.isAvailable()) {
            borrowedBooks.add(book.getBookId());
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    public boolean returnBook(Book book) {
        if (borrowedBooks.contains(book.getBookId())) {
            borrowedBooks.remove(book.getBookId());
            book.setAvailable(true);
            return true;
        }
        return false;
    }

    public abstract int getLimit();
}


