package myapp.model;


public class BookView {
    Integer bookId;
    String  title;
    
    public BookView(Integer bookId, String title) {
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
    
    
}
