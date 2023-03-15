package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper=true, includeFieldNames=true)
public class Book extends Publication{
    private String ISBN;

    public Book(String title, String author,int yearPublished, String ISBN){
        super(title, author, yearPublished);
        this.ISBN = ISBN;
    }
}
