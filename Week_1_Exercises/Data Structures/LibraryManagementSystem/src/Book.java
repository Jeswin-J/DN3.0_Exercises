public class Book {
    private static int count;
    private String bookId;
    private String title;
    private String author;

    Book(String title, String author){
        setBookId("BOOK_"+ count++);
        setTitle(title);
        setAuthor(author);
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString(){
        return "Book Id: " + getBookId() + " Title: " + getTitle() + " Author " + getAuthor();
    }
}
