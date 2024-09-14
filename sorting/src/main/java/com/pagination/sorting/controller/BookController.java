package com.pagination.sorting.controller;


import com.pagination.sorting.api.BooksApi;
import com.pagination.sorting.model.Book;
import com.pagination.sorting.model.PagedBooks;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

@RestController
@SessionScope
public class BookController implements BooksApi {
    @Override
    public ResponseEntity<Book> createBook(Book book) {
        return BooksApi.super.createBook(book);
    }

    @Override
    public ResponseEntity<Void> deleteBookById(Integer id) {
        return BooksApi.super.deleteBookById(id);
    }

    @Override
    public ResponseEntity<Book> getBookById(Integer id) {
        return BooksApi.super.getBookById(id);
    }

    @Override
    public ResponseEntity<PagedBooks> getBooks(Integer page, Integer size, String sort) {
        return BooksApi.super.getBooks(page, size, sort);
    }

    @Override
    public ResponseEntity<PagedBooks> getBooksByGenre(String genre, Integer page, Integer size, String sort) {
        return BooksApi.super.getBooksByGenre(genre, page, size, sort);
    }

    @Override
    public ResponseEntity<PagedBooks> searchBooks(Integer page, Integer size, String sort, String query) {
        return BooksApi.super.searchBooks(page, size, sort, query);
    }

    @Override
    public ResponseEntity<Book> updateBookById(Integer id, Book book) {
        return BooksApi.super.updateBookById(id, book);
    }
}
