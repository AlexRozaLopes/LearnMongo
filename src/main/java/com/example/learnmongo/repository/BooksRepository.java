package com.example.learnmongo.repository;

import com.example.learnmongo.model.BookModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BooksRepository extends MongoRepository<BookModel, String> {

    Optional<BookModel> findByName(String name);
}
