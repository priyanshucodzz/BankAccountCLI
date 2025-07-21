package book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void registerBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public boolean issueBook(User user, Book book) {
        return user.borrowBook(book);
    }

    public boolean receiveBook(User user, Book book) {
        return user.returnBook(book);
    }
}