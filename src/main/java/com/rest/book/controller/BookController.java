package com.rest.book.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.book.entity.Book;
import com.rest.book.service.BookService;


@RestController
public class BookController {
	
	@Autowired BookService bookService; 
	
	@RequestMapping(value= {"/addbook"}, method = RequestMethod.POST)
	public void addBook(@Valid @RequestBody Book bk) {
		String title = bk.getTitle();
		String description = bk.getDescription() ;
		bookService.addBook(title, description);
	}
	
	@RequestMapping(value = {"/books"}, method = RequestMethod.GET)
	public List<Book> listBook() {
		List<Book> result = bookService.listBooks(); ;
		return result;
	}
	
//	@RequestMapping(value = "{/book/bookId}", method = RequestMethod.GET )
//		@RequestHeader(value = "bookId")
//	public Resource<Book> getBook(@PathVariable int bookId ) {
////		Optional<Book> book = bookService.getBook(bookId);
////		
////		Resource<Book> resource = new Resource<Book>(book.get());
//		Optional<Book> book = bookService.find
//
//	    if (!book.isPresent())
//	      throw new StudentNotFoundException("id-" + id);
//
//	    Resource<Student> resource = new Resource<Student>(book.get());
//
//	    ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllStudents());
//
//	    resource.add(linkTo.withRel("all-students"));
//
//	    return resource;		
////		
//	}
//	
//	@RequestMapping(value = {"/delete"}, method = RequestMethod.DELETE)
//	public void deleteBook(@RequestParam  ) {
//		
//	}
}
