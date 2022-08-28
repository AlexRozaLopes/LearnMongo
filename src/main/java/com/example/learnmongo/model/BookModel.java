package com.example.learnmongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "books")
@Data
public class BookModel {

    @Id
    private String id;
    @Field("name")
    private String name;
    @Field("author")
    private String author;
}
