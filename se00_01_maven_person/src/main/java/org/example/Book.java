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
    private int readPages;
    private boolean bookRead;

    public Book (String title, String ISBN, int pages){
        this.title = title;
        this.ISBN = ISBN;
        this.pages = pages;
        this.author = new Author();
        this.bookRead = false;
        this.readPages = 0;
    }

    public String  readBook(int pages){
        // counts the pages read and returns the remaining pages as a string
        this.readPages += pages;
        return (readPages- pages) + " remaining to finish the book";
    }

    public Boolean finishedBook(){
        // changes the boolean value if book is read
        if (readPages >= pages){
             this.bookRead = true;
        } else {
            this.bookRead = false;
        }
        return bookRead;
    }
}
