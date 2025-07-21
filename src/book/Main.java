package book;
public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Admin admin = new Admin("A001");


        Book book1 = new Book("B001", "The Alchemist", "Paulo Coelho");
        Book book2 = new Book("B002", "Clean Code", "Robert Martin");


        admin.addBook(library, book1);
        admin.addBook(library, book2);


        Student student = new Student("S001", "Alice");
        Teacher teacher = new Teacher("T001", "Mr. Bob");


        library.addUser(student);
        library.addUser(teacher);


        if (library.issueBook(student, book1)) {
            System.out.println("Book issued to student.");
        } else {
            System.out.println("Issue failed.");
        }


        if (library.issueBook(teacher, book1)) {
            System.out.println("Book issued to teacher.");
        } else {
            System.out.println("Issue failed. Book already issued.");
        }


        if (library.receiveBook(student, book1)) {
            System.out.println("Book returned by student.");
        }

        // Now teacher borrows the book
        if (library.issueBook(teacher, book1)) {
            System.out.println("Book issued to teacher after return.");
        }
    }
}
