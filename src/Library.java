class Library {
    private Book[] books;
    private int count;

    Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Library full, can't add book.");
        }
    }

    public void removeBook(Book book) {
        for (int i = 0; i < count; i++) {
            if (books[i] == book) {
                books[i] = books[count - 1];
                books[count - 1] = null;
                count--;
                break;
            }
        }
    }

    public void displayBooks() {
        System.out.println("\n--- Library Books ---");
        for (int i = 0; i < count; i++) {
            books[i].displayBookInfo();
        }
        System.out.println("Total Books in Library: " + Book.getTotalBooks());
    }
}