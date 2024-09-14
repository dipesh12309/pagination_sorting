package com.pagination.sorting.controller;

import com.pagination.sorting.api.GenresApi;
import com.pagination.sorting.model.Genre;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@RestController
@SessionScope
public class GenreController implements GenresApi {
    @Override
    public ResponseEntity<Genre> createGenre(Genre genre) {
        return GenresApi.super.createGenre(genre);
    }

    @Override
    public ResponseEntity<Void> deleteGenreById(Integer id) {
        return GenresApi.super.deleteGenreById(id);
    }

    @Override
    public ResponseEntity<List<Genre>> getGenres() {
        return GenresApi.super.getGenres();
    }
}
