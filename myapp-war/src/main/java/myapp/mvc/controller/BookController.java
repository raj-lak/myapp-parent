package myapp.mvc.controller;

import myapp.model.Book;
import myapp.mvc.annotation.MyAnno;
import myapp.service.stub.IBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BookController {
    
    @Autowired
    IBookService bookService;
    
    @RequestMapping( "/book")
    public ResponseEntity<String> getBook() {
        Book book = bookService.getBook(5);
        ResponseEntity<String> response = new ResponseEntity<>("Response:<br>" + book.toString(),
                 HttpStatus.OK);
        return response;
        
    }
    
    @RequestMapping( path="/books.do", method=RequestMethod.GET)
    public String getBooks(Model model, @MyAnno String clientIPAddress) {
        model.addAttribute("result", clientIPAddress);
        return "books";
        
    }

}
