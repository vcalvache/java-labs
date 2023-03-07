package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author extends Person{
    private String genre;
    private Book book;
    private ArrayList<Book> bookList;

    public Author (String firstName, String lastName, int age, String genre){
        super(firstName, lastName, age, false);
        this.genre = genre;
        this.book = new Book();
        this.bookList = new ArrayList<>();
    }

    public Book authorWritesNewBook(String title, String ISBN, int pages){
        // return a new Book written by the author
        return new Book(title, ISBN, pages);
    }

    public void addBooksToList(Book book){
        // adds book to ArrayList
        this.bookList.add(book);
    }

    public Book getOneBook(String title){
        // finds a Book on the author ArrayList
        for (Book book: this.bookList){
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }
}
