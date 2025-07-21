package book;

public class Student extends User {
    private final int maxBooks = 3;

    public Student(String userId, String name) {
        super(userId, name);
    }

    @Override
    public int getLimit() {
        return maxBooks;
    }
}
