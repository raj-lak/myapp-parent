package myapp.dao.stub;

import java.util.List;

import myapp.model.Book;

public interface IBookDAO {

    public void save(Book book);

    public List<Book> getAll();

}
