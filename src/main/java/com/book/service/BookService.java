package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.book.entity.Book;
import com.book.repo.BookRepo;

@Component
public class BookService {
	
	@Autowired
	BookRepo br;

	public List<Book> getAllBooks() {
		return (List<Book>) br.findAll();
		
	}

	public Book getBook(int bid) {
		// TODO Auto-generated method stub
		return br.findById(bid);
	}

	public String insertBook(Book b) {
		// TODO Auto-generated method stub
		System.out.println(b);
		br.save(b);
		return "Success";
	}

	public String deleteBook(int bid) {
		br.delete(br.findById(bid));
		return "Book deleted";
	}

	public String updateBook(int bid, Book b) {
		if(br.findById(bid)!=null) {
			br.save(b);
			return "Book updated";
		}
		
		else {
			return "Book is not existing";
		}
	}
}
