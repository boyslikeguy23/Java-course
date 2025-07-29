package org.example.lesson08.service;

import org.example.lesson08.entity.Author;
import org.example.lesson08.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    public Author getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }
    public Author saveAuthor(Author author) {
        return authorRepository.save(author);
    }
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
    public List<Author> findAllById(List<Long> ids){return authorRepository.findAllById(ids);}
}
