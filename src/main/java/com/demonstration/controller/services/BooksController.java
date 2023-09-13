package com.demonstration.controller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demonstration.model.Book;


import jakarta.validation.Valid;

@RestController
@RequestMapping("book")
public class BooksController {
@Autowired
BookServiceImplement bookServiceImplement;
	
@GetMapping
public List<Book> getAllbook()
{
	return bookServiceImplement.getAllBook();
}
@PostMapping()
public Book addOne(@RequestBody @Valid Book book)
{
return bookServiceImplement.addOneBook(book);	
}
@DeleteMapping("/{id}")
public void deleteMe(@PathVariable long id)
{
	
bookServiceImplement.deleteBook(id);
}

}
