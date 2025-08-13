package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bs;
	
	@GetMapping("/book")
	List <Book> getAllBook() {
		return bs.getAllBooks();
	}
	
	@GetMapping("/book/{id}")
	Book getBook(@PathVariable("id") int bid){
		return bs.getBook(bid);
	}
	
	@PostMapping("/book")
	String insertBook(@RequestBody Book b) {
		return bs.insertBook(b);
	}
	
	@DeleteMapping("/book/{id}")
	String deleteBook(@PathVariable("id") int bid) {
		return bs.deleteBook(bid);	
	}
	
	@PutMapping("/book/{bid}")
	String updateBook(@PathVariable("bid") int bid,@RequestBody Book b) {
		return bs.updateBook(bid,b);
	}
}
