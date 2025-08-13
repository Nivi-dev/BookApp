package com.book.repo;

import org.springframework.data.repository.CrudRepository;

import com.book.entity.Book;

public interface BookRepo extends CrudRepository<Book, Integer>{
	
	Book findById(int id);
}


