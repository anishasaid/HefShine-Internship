package com.api.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.dao.BookRepository;
import com.api.entities.Book;

@Component
public class BookService {
	
	@Autowired
	private BookRepository bookRepo;
	
	//get all books
	public List<Book> getAllBooks(){
		return this.bookRepo.findAll();
	}
	
	//get single book by id
	public Book getBookById(int id) {
		
		Book book = null;
		
		try {
			book = this.bookRepo.findById(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return book;
	}
	
	//adding the book
	public Book addBook(Book book) {
		Book result = this.bookRepo.save(book);
		return result;
	}
	
	//delete book
	public void deleteBook(int id) {		
		this.bookRepo.deleteById(id);
	}
	
	//update book
	public void updateBook(Book book , int boookId) {
		book.setId(boookId);
		this.bookRepo.save(book);
	}
}
