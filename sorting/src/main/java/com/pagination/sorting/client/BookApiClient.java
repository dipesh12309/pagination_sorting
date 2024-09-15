package com.pagination.sorting.client;

import com.pagination.sorting.model.Book;
import com.pagination.sorting.model.PagedBooks;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class BookApiClient {
    private final String baseUrl;
    private final RestTemplate restTemplate;

    public BookApiClient(String baseUrl) {
        this.baseUrl = baseUrl;
        this.restTemplate = new RestTemplate();
    }

    public Book createBook(Book book) {
        String url = baseUrl + "/books";
        ResponseEntity<Book> response = restTemplate.postForEntity(url, book, Book.class);
        return response.getBody();
    }

    public void deleteBookById(Integer id) {
        String url = baseUrl + "/books/" + id;
        restTemplate.delete(url);
    }

    public Book getBookById(Integer id) {
        String url = baseUrl + "/books/" + id;
        ResponseEntity<Book> response = restTemplate.getForEntity(url, Book.class);
        return response.getBody();
    }

    public PagedBooks getBooks(Integer page, Integer size, String sort) {
        String url = UriComponentsBuilder.fromHttpUrl(baseUrl + "/books")
                .queryParam("page", page)
                .queryParam("size", size)
                .queryParam("sort", sort)
                .toUriString();
        ResponseEntity<PagedBooks> response = restTemplate.getForEntity(url, PagedBooks.class);
        return response.getBody();
    }

    public PagedBooks getBooksByGenre(String genre, Integer page, Integer size, String sort) {
        String url = UriComponentsBuilder.fromHttpUrl(baseUrl + "/books/genre/" + genre)
                .queryParam("page", page)
                .queryParam("size", size)
                .queryParam("sort", sort)
                .toUriString();
        ResponseEntity<PagedBooks> response = restTemplate.getForEntity(url, PagedBooks.class);
        return response.getBody();
    }

    public PagedBooks searchBooks(Integer page, Integer size, String sort, String query) {
        String url = UriComponentsBuilder.fromHttpUrl(baseUrl + "/books/search")
                .queryParam("page", page)
                .queryParam("size", size)
                .queryParam("sort", sort)
                .queryParam("query", query)
                .toUriString();
        ResponseEntity<PagedBooks> response = restTemplate.getForEntity(url, PagedBooks.class);
        return response.getBody();
    }

    public Book updateBookById(Integer id, Book book) {
        String url = baseUrl + "/books/" + id;
        ResponseEntity<Book> response = restTemplate.exchange(url, HttpMethod.PUT, new HttpEntity<>(book), Book.class);
        return response.getBody();
    }
}
