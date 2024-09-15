package com.pagination.sorting.controller;


import com.pagination.sorting.api.BooksApi;
import com.pagination.sorting.model.Book;
import com.pagination.sorting.model.PagedBooks;
import com.pagination.sorting.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

@RestController
@SessionScope
public class BookController implements BooksApi {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public ResponseEntity<Book> createBook(Book book) {
        Book createdBook = this.bookService.createBook(book);
        return new ResponseEntity<>(createdBook, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> deleteBookById(Integer id) {
        try {
            this.bookService.deleteBookById(id);
        } catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(null,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Book> getBookById(Integer id) {
        Book book = this.bookService.getBookById(id);
        return new ResponseEntity<>(book,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PagedBooks> getBooks(Integer page, Integer size, String sort) {
        PagedBooks pagedBooks = this.bookService.getBooks(page,size,sort);
        return new ResponseEntity<>(pagedBooks,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PagedBooks> getBooksByGenre(String genre, Integer page, Integer size, String sort) {
        PagedBooks pagedBooks = bookService.getBooksByGenre(genre,page,size,sort);
        return new ResponseEntity<>(pagedBooks,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<PagedBooks> searchBooks(Integer page, Integer size, String sort, String query) {
        PagedBooks pagedBooks = bookService.searchBooks(page,size,sort,query);
        return new ResponseEntity<>(pagedBooks,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Book> updateBookById(Integer id, Book book) {
        Book updatedBook = bookService.updateBookById(id,book);
        return new ResponseEntity<>(updatedBook,HttpStatus.OK);
    }
}
