package org.example.lesson07_part02.controller;

import org.example.lesson07_part02.entity.Book;
import org.example.lesson07_part02.repository.BookRepository;
import org.example.lesson07_part02.service.BookService;
import org.example.lesson07_part02.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Service
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String showAllBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "book/book-list";
    }
    @GetMapping("/create")
    public String createBook(Model model) {
        model.addAttribute("book", new Book());
        return "book/book-form";
    }
    @PostMapping("/save")
    public String saveBook(@ModelAttribute("book") Book book) {
        bookService.saveBook(book);
        return "redirect:/book";
    }
    @GetMapping("/edit/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
        model.addAttribute("book", bookService.getBookById(id));
        model.addAttribute("category", categoryService.getAllCategories());
        return "book/book-form";
    }
    @PostMapping("/update/{id}")
    public String updateBook(@PathVariable("id") Long id, @ModelAttribute("book") Book book) {
        book.setId(id);
        bookService.saveBook(book);
        return "redirect:/book";
    }
    @GetMapping("/delete")
    public String deleteBook(@RequestParam("id") Long id) {
        bookService.deleteBookById(id);
        return "redirect:/book";
    }
}
