package com.example.learnmongo.controller;

import com.example.learnmongo.model.BookModel;
import com.example.learnmongo.service.BooksService;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@Data
public class BooksController {

    private final BooksService booksService;


    @PostMapping("/add")
    public ResponseEntity<BookModel> addBook(@RequestBody BookModel book) {
        return ResponseEntity.ok(booksService.addBook(book));
    }
}
