package myapp.service;

import java.util.List;

import myapp.dao.stub.IBookDAO;
import myapp.model.Book;
import myapp.service.stub.IBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {

    @Autowired
    IBookDAO bookDAO;
    
    @Override
    public Book getBook(Integer bookId) {
        Book book = new Book(5, "Tale of two cities");
        return book;
    }
    
    @Override
    public List<Book> getAll() {
        return bookDAO.getAll();
    }
    
    @Override
    public void saveBook(String title) {
        Book book = new Book();
        book.setTitle(title);
        bookDAO.save(book);
    }
    

}
