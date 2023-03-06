package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author extends Person{
    private String genre;
    private Book book;

    public Author (String firstName, String lastName, int age, String genere){
        super(firstName, lastName, age, false);
        this.genre = genere;
        this.book = new Book();
    }
}
