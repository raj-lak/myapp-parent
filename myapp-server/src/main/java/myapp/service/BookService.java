package myapp.service;

import java.util.List;

import myapp.dao.stub.IBookDAO;
import myapp.model.Book;
import myapp.service.stub.IBookService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {

    private static final Logger LOG = LoggerFactory.getLogger(BookService.class);

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

    @Override
    public Book findByTitle(String title) {
        LOG.info("title:{}", title); //info level needed to see logs during unit test
        return bookDAO.findByTitle(title);
    }

    public void delete(Book book) {
        bookDAO.remove(book);
    }
    

}
