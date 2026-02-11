import java.util.ArrayList;

class Library {
    private ArrayList<Book> books= new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added Successfully");
    }
    public void showBooks() {
        for (Book b : books) {
            b.displayBook();
        }
    }
    public void issueBook(int bookId, Member member) {
        for(Book b : books) {
            if(b.getBookId() == bookId && b.isAvailable()) {
                b.setAvailable(false);
                System.out.println("Book issued to " + member.getMemberName());
                return;
            }
        }
        System.out.println("Book not Available");
    }

    public  void returnBook(int bookId) {
        for(Book b: books) {
            if(b.getBookId()== bookId && ! b.isAvailable()) {
                b.setAvailable(true);
                System.out.println("Book returned Successfully");
                return;
            }
        }
        System.out.println("Invalid return");
    }
}
