public class Main {
    public static void main(String[] args) {

        Library library = new Library(10);

        // Creating Books
        Book b1 = new Book("Harry Potter", "J.K. Rowling");
        Book b2 = new Book("Sherlock Holmes", "Arthur Conan Doyle");
        Book b3 = new Book("The Alchemist");

        // Librarian adds books
        Librarian librarian = new Librarian("Mr. Smith", 101);
        librarian.addBook(b1, library);
        librarian.addBook(b2, library);
        librarian.addBook(b3, library);

        library.displayBooks();

        // Member borrows books
        Member member = new Member("John", 201);
        member.displayUserInfo();

        member.borrowBook(b1);
        member.borrowBook(b2);

        library.displayBooks();

        member.returnBook(b1);
        library.displayBooks();

        librarian.removeBook(b2, library);
        library.displayBooks();
    }
}