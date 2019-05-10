package com.rest.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.book.entity.Book;
import com.rest.book.repository.BookRepository;

@Component
public class BookService {
	
	@Autowired BookRepository bookRepository;
	
	public void addBook(String title, String description) {
		Book book = new Book();
		book.setTitle(title);
		book.setDescription(description);
		bookRepository.save(book);
	}
	
	public List<Book> listBooks() {
		return bookRepository.findAll();
	}
	
	public Optional<Book> getBook(int bookId) {
		return bookRepository.findById(bookId);
	}
}
