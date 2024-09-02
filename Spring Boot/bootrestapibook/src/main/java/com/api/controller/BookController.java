package com.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.entities.Book;
import com.api.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	//get all handler
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getBooks() {
		
		List<Book> list = this.bookService.getAllBooks();
		if(list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	//get single book handler
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBook(@PathVariable int id) {
		
		Book book =  this.bookService.getBookById(id);
		if(book == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));
	}
	
	//add new book handler
	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		
		Book b = null;
		
		try {
			b = this.bookService.addBook(book);
			System.out.println(book);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	
	//delete book handler
	@DeleteMapping("/books/{bookid}")
	public ResponseEntity<Void> deleteBook(@PathVariable int bookid) {
		try {
			this.bookService.deleteBook(bookid);
			//return ResponseEntity.ok().build();
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		}
	}
	
	//update book handler
	@PutMapping("/books/{boookId}")
	public ResponseEntity<Book> updateBook(@RequestBody Book book,@PathVariable int boookId) {
		
		try {
			this.bookService.updateBook(book, boookId);
			return ResponseEntity.ok().body(book);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
