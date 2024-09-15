package com.pagination.sorting.config;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    class ModelBook extends com.pagination.sorting.model.Book {}
    class EntityBook extends com.pagination.sorting.entity.Book {}


    public EntityBook toEntity(ModelBook modelBook) {
        EntityBook entityBook = new EntityBook();
        entityBook.setId(modelBook.getId());
        entityBook.setTitle(modelBook.getTitle());
        entityBook.setAuthor(modelBook.getAuthor());
        entityBook.setIsbn(modelBook.getIsbn());
        entityBook.setPublicationDate(modelBook.getPublicationDate());
        entityBook.setGenre(modelBook.getGenre());
        entityBook.setDescription(modelBook.getDescription());
        entityBook.setPrice(modelBook.getPrice());
        return entityBook;
    }

    public ModelBook toModel(EntityBook entityBook) {
        ModelBook modelBook = new ModelBook();
        modelBook.setId(entityBook.getId());
        modelBook.setTitle(entityBook.getTitle());
        modelBook.setAuthor(entityBook.getAuthor());
        modelBook.setIsbn(entityBook.getIsbn());
        modelBook.setPublicationDate(entityBook.getPublicationDate());
        modelBook.setGenre(entityBook.getGenre());
        modelBook.setDescription(entityBook.getDescription());
        modelBook.setPrice(entityBook.getPrice());
        return modelBook;
    }
}
