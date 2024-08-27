// src/main/java/com/yourcompany/bookstoreapi/service/BookService.java
package com.example.BookstoreAPI.service;

import com.example.BookstoreAPI.entity.Book;
import com.example.BookstoreAPI.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}

// src/main/java/com/yourcompany/bookstoreapi/service/CustomerService.java

