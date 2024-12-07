package com.klef.jfsd.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.model.Book;
import com.klef.jfsd.exam.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository repository;

	@Override
	public String updateBook(Integer id, Book book) {
		if(repository.existsById(id)) {
            book.setBookId(id); // Make sure the ID of the product is set to the correct value.
            repository.save(book);
            return "Book updated successfully";
        } else {
            return "Book not found";
        }
	}

}
