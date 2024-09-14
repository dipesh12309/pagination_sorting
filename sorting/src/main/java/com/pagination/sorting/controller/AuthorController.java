package com.pagination.sorting.controller;

import com.pagination.sorting.api.AuthorsApi;
import com.pagination.sorting.model.Author;
import com.pagination.sorting.model.PagedAuthors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

@RestController
@SessionScope
public class AuthorController implements AuthorsApi {
    @Override
    public ResponseEntity<Author> createAuthor(Author author) {
        return AuthorsApi.super.createAuthor(author);
    }

    @Override
    public ResponseEntity<Void> deleteAuthorById(Integer id) {
        return AuthorsApi.super.deleteAuthorById(id);
    }

    @Override
    public ResponseEntity<Author> getAuthorById(Integer id) {
        return AuthorsApi.super.getAuthorById(id);
    }

    @Override
    public ResponseEntity<PagedAuthors> getAuthors(Integer page, Integer size, String sort) {
        return AuthorsApi.super.getAuthors(page, size, sort);
    }

    @Override
    public ResponseEntity<Author> updateAuthorById(Integer id, Author author) {
        return AuthorsApi.super.updateAuthorById(id, author);
    }
}
