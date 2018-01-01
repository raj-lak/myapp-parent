package myapp.service.stub;

import java.util.List;

import myapp.model.Book;

public interface IBookService {
  
  public Book getBook(Integer bookId);
  public void saveBook(String title);
  public List<Book> getAll();
  
}
