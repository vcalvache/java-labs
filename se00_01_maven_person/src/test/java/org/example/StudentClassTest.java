package org.example;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StudentClassTest {

    @Test
    public void createStudentTest(){
        // initializing values
        String firstName = "Victor";
        String lastName = "Calvache";
        int age = 37;
        String university = "CIFO La Violeta";

        Car fiat500 = new Car(5, 3, "Black");
        Book javaProgramming  = new Book("Java Programming", "12345NB", 378);
        ArrayList<Book> books = new ArrayList<>();
        books.add(javaProgramming);

        Student newStudent = new Student();

        // setting values
        newStudent.setFirstName(firstName);
        newStudent.setLastName(lastName);
        newStudent.setAge(age);
        newStudent.setUniversity(university);
        newStudent.setCar(fiat500);
        newStudent.setBooks(books);

        // comparing values
        assertNotNull(newStudent);
        assertEquals(firstName, newStudent.getFirstName());
        assertEquals(lastName, newStudent.getLastName());
        assertEquals(age, newStudent.getAge());
        assertEquals(university, newStudent.getUniversity());
        assertEquals(fiat500, newStudent.getCar());
        assertEquals(books, newStudent.getBooks());
    }

    @Test
    public void createFakeStudentTest(){
        Faker faker = new Faker();

        // create a student with fake params
        Student fakeStudent = new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100),
                faker.university().name());

        //checks fake student is not null
        assertNotNull(fakeStudent);
        System.out.println(fakeStudent.toString());
    }

    @Test
    public void changesUniversityTest(){
        Faker faker = new Faker();

        Student fakeStudent = new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100),
                faker.university().name());

        // stores initial university value
        String originalUniversity = fakeStudent.getUniversity();
        // creates a new university nam
        String newUniversity = faker.university().name();
        // sets new value
        fakeStudent.changesUniversity(newUniversity);
        // compares initial value and actual value are different
        assertNotEquals(originalUniversity, fakeStudent.getUniversity());
    }

    @Test
    public void buyBook(){
        Faker faker = new Faker();

        Student fakeStudent = new Student(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100),
                faker.university().name());

        // creates new book
        Book fakeBook = new Book(faker.book().title(), "12345NB", faker.number().numberBetween(0, 500));

        //adds book to student booklist
        fakeStudent.buyBook(fakeBook);
        // compares values
        assertEquals(fakeBook.toString(), fakeStudent.getBooks().get(0).toString());
    }
}
