package com.scheduleTask.demoSchdule;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {


    @Autowired
    BookRepository bookRepository;


    @PostMapping("/save")
    public Book saved(@RequestBody Book book){

      Book savedBook =  bookRepository.save(book);
        return savedBook;
    }

    @GetMapping("/get/{field}")
    public List<Book> getAllBooks(@PathVariable String field){
        return bookRepository.findAll(Sort.by(field));
    }






}
