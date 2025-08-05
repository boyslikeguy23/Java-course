package org.example.lesson07_part02.service;

import org.example.lesson07_part02.entity.Book;
import org.example.lesson07_part02.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }
    public void saveBook(Book book) {bookRepository.save(book);
    }
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
}
