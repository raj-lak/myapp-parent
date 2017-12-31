package myapp.service;

import myapp.model.Book;
import myapp.service.stub.IBookService;

import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {

    @Override
    public Book getBook(Integer bookId) {
        Book book = new Book(5, "Tale of two cities");
        return book;
    }
    
    

}
