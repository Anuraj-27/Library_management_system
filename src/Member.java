class Member extends User implements Borrowable {
    private int borrowedBooks = 0;

    Member(String name, int id) {
        super(name, id);
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.issue();
            borrowedBooks++;
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }

    @Override
    public void returnBook(Book book) {
        book.returned();
        borrowedBooks--;
        System.out.println(name + " returned: " + book.getTitle());
    }

    @Override
    void displayUserInfo() {
        System.out.println("Member: " + name + ", ID: " + id + ", Borrowed Books: " + borrowedBooks);
    }
}