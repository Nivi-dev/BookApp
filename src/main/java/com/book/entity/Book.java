package com.book.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="books")
public class Book {
	
	@Id
	@Column(name="book_id")
	private int book_id;
	@Column(name="book_title")
	private String book_title;
	@Column(name="book_author")
	private String book_author;
	
	public Book(int book_id, String book_title, String book_author) {
		super();
		this.book_id = book_id;
		this.book_title = book_title;
		this.book_author = book_author;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_title=" + book_title + ", book_author=" + book_author + "]";
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getBook_title() {
		return book_title;
	}

	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	
	
	
}
