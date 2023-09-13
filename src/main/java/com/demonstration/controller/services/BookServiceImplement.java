package com.demonstration.controller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demonstration.model.Book;
import com.demonstration.repo.BookRepository;




@Service
public class BookServiceImplement implements BooksInterface {

	@Autowired
	BookRepository bookRepository;
	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book getOne(long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteBook(long id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);

	}

	@Override
	public Book addOneBook(Book Book) {
		// TODO Auto-generated method stub
		return bookRepository.save(Book);
	}


}
