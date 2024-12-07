package com.klef.jfsd.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.service.BookService;

@RestController
@RequestMapping("book")
public class BookController {
	
	 @Autowired
	 private BookService service;
	 
	 @PutMapping("update/{id}")
	    public String updateBook(@PathVariable Integer id, @RequestBody Book book) {
	        return service.updateBook(id, book);
	    }

}
