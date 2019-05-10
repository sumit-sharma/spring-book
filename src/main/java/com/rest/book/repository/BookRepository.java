package com.rest.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.book.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	
}
