package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

enum Status{
    AVAILABLE,
    BORROWED;
}
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Publication {
    private String title;
    private String author;
    private int yearPublished;
    private static int index = 0;
    private int publicationID;

    public Publication (String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        index++;
        this.publicationID = index;
    }
}
