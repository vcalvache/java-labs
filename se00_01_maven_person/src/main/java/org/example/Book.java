package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String title;
    private String ISBN;
    private int pages;
    private Author author;

    public Book (String title, String ISBN, int pages){
        this.title = title;
        this.ISBN = ISBN;
        this.pages = pages;
        this.author = new Author();
    }
}
