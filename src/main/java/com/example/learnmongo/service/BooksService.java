package com.example.learnmongo.service;

import com.example.learnmongo.model.BookModel;
import com.example.learnmongo.repository.BooksRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class BooksService {

    private final BooksRepository booksRepository;

    public BookModel addBook(BookModel book) {
        return booksRepository.save(book);
    }
}

