package myapp.model;


public class Book {

    Integer bookId;
    String  title;
    
    
    public Book(Integer bookId, String title) {
        super();
        this.bookId = bookId;
        this.title = title;
    }
    
    public Integer getBookId() {
        return bookId;
    }
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", title=" + title + "]";
    }
    
    
    
}
