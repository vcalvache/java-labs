package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper=true, includeFieldNames=true)
public class Author extends Person{
    private ArrayList<Book> books;

    public Author(String firstName, String lastName){
        super(firstName, lastName);
        this.books = new ArrayList<Book>();
    }
}
