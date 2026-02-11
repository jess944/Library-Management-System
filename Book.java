class Book {
    private int id;
    private String title;
    private String author;
    private boolean available;

    public Book(int bookId, String bookTitle, String bookAuthor ) {
        this.id=bookId;
        this.title=bookTitle;
        this.author=bookAuthor;
        this.available=true;
    }

    public int getBookId() {
        return id;
    }

    public String getBookTitle() {
        return title;
    }

    public String getBookAuthor() {
        return author;
    }
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean status) {
        available=status;
    }

    public void displayBook() {
        System.out.println(id + "|" + title + "|" + author + "|" + (available ? "Available" : "Issued"));
    }
}
