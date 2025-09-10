public class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", "Robert C. Martin");
        Book b2 = new Book("Effective Java", "Joshua Bloch");
        b1.issueBook();
        b1.issueBook();
        b1.returnBook();
        b2.issueBook();
        b2.returnBook();
    }
}
