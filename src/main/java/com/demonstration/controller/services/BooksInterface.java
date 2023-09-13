package com.demonstration.controller.services;

import java.util.List;

import com.demonstration.model.Book;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BooksInterface {
public List<Book> getAllBook();
public Book getOne(long id);
public void deleteBook(long id);
public Book addOneBook(Book Book);
}
