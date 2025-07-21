package book;

public class Teacher extends User {
    private final int maxBooks = 5;

    public Teacher(String userId, String name) {
        super(userId, name);
    }

    @Override
    public int getLimit() {
        return maxBooks;
    }
}
