package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student extends Person{
    private String university;
    private Car car;
    private ArrayList<Book> books;

    public Student(String firstName, String lastName, int age, String university){
        super(firstName, lastName, age, false);
        this.university = university;
        this.car = new Car();
        this.books = new ArrayList<>();
    }

    public void changesUniversity(String university){
        // changes student university
        this.university = university;
    }

    public void buyBook(Book book){
        // add a new book to student's bookList
        this.books.add(book);
    }
}
