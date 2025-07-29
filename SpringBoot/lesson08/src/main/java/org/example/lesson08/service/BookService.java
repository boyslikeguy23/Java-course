package org.example.lesson08.service;

import org.example.lesson08.entity.Book;
import org.example.lesson08.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {


    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }


    public List<Book> getAllBooks() { return bookRepository.findAll(); }

    public Book saveBook(Book book) { return bookRepository.save(book); }

    public Book getBookById(Long id){ return bookRepository.findById(id).orElseThrow(null); }

    public void deleteBookById(Long id){ bookRepository.deleteById(id); }
}
