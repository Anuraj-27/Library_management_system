class Librarian extends Member {

    Librarian(String name, int id) {
        super(name, id);
    }

    void addBook(Book book, Library library) {
        library.addBook(book);
        System.out.println("Librarian " + name + " added book: " + book.getTitle());
    }

    void removeBook(Book book, Library library) {
        library.removeBook(book);
        System.out.println("Librarian " + name + " removed book: " + book.getTitle());
    }
}

