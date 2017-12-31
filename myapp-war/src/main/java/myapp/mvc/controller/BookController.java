package myapp.mvc.controller;

import myapp.mvc.annotation.MyAnno;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BookController {
    
    @RequestMapping( "/book")
    public ResponseEntity<String> getBook() {
        ResponseEntity<String> response = new ResponseEntity<>("body", HttpStatus.OK);
        return response;
        
    }
    
    @RequestMapping( path="/books.do", method=RequestMethod.GET)
    public String getBooks(Model model, @MyAnno String clientIPAddress) {
        model.addAttribute("result", clientIPAddress);
        return "books";
        
    }

}
