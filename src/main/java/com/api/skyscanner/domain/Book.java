package com.api.skyscanner.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "Books")
public class Book {

    @Id
    private String id;
    private String title;
    private Integer pages;
    private Integer rating;
    private String author;

}
