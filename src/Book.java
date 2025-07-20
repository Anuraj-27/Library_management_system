public class Book {
    private final String title;
    private final String author;
    private boolean isIssued;
    private static int totalBooks = 0;

    // Constructor Overloading
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
        totalBooks++;
    }

    Book(String title) {
        this(title, "Unknown Author");
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return !isIssued;
    }

    public void issue() {
        if (!isIssued) isIssued = true;
    }

    public void returned() {
        if (isIssued) isIssued = false;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public void displayBookInfo() {
        System.out.println("Book: " + title + " | Author: " + author + " | Available: " + !isIssued);
    }
}

