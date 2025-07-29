package org.example.lesson08.controller;

import lombok.Getter;
import org.example.lesson08.entity.Author;
import org.example.lesson08.entity.Book;
import org.example.lesson08.service.AuthorService;
import org.example.lesson08.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    private final AuthorService authorService;

    @Autowired
    public BookController(BookService bookService, AuthorService authorService) {
        this.authorService = authorService;
        this.bookService = bookService;
    }

    private static final String UPLOAD_DIR = "src/main/resources/static/";

    private static final String UPLOAD_PathFile = "images/products/";

    //Show all books
    @GetMapping
    public String showAllBooks(Model model) {
        model.addAttribute("Books", bookService.getAllBooks());
        return "books/book-list";
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("authors", authorService.getAllAuthors());
        return "books/book-form";
    }

    @PostMapping("/new")
    public String saveBook(@ModelAttribute Book book, @RequestParam List<Long> authorIds, @RequestParam("imageBook") MultipartFile imageFile) {
        if (!imageFile.isEmpty()) {
            try {
                //Tao thu muc neu chua ton tai
                Path uploadPath = Paths.get(UPLOAD_DIR + UPLOAD_PathFile);
                if (!Files.exists(uploadPath)) {
                    Files.createDirectories(uploadPath);
                }
                //Lay phan mo rong cua file anh
                String originalFilename = StringUtils.cleanPath(imageFile.getOriginalFilename());
                String fleExtension = originalFilename.substring(originalFilename.lastIndexOf("."));

                //Luu file len server
                //String fileName = imageFile.getOriginalFilename();
                //Path filePath = uploadPath.resolve(fileName);

                //Tao ten file moi + phan mo rong goc
                String newFileName = book.getCode() + fleExtension;
                Path filePath = uploadPath.resolve(newFileName);
                Files.copy(imageFile.getInputStream(), filePath);

                //Luu duong dan anh vao thuoc tinh imgUrl cua Book
                book.setImgUrl("/" + UPLOAD_PathFile + newFileName);
            }catch (IOException e) {
                e.printStackTrace();
                // Neu co loi, co the tra ve trang loi hoac trang truoc
//                return "redirect:/books/new?error=Could not save image";
            }
        }
        List<Author> authors = new ArrayList<>(authorService.findAllById(authorIds));
        book.setAuthors(authors);
        bookService.saveBook(book);
        return "redirect:/books";
    }

    //Form sua thong tin sach
    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model){
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        model.addAttribute("authors", authorService.getAllAuthors());
        return "books/book-form";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.deleteBookById(id);
        return "redirect:/books";
    }
}