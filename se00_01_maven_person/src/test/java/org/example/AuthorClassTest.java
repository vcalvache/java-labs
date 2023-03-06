package org.example;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class AuthorClassTest {

    @Test
    public void createAuthorTest(){
        // manually creating parameters
        String firstName = "Stephen";
        String lastName = "King";
        int age = 72;
        String genre = "Horror";

        // creating and empty object and setting parameters for Author
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        author.setAge(age);
        author.setGenre(genre);

        // Creating a Book
        Book book = new Book("It", "12345NB", 328, author);
        author.setBook(book);
        // Testing all parameters and not null
        assertEquals(firstName, author.getFirstName());
        assertEquals(lastName, author.getLastName());
        assertEquals(age, author.getAge());
        assertEquals(genre, author.getGenre());
        assertEquals(book, author.getBook());

    }
    @Test
    public void createFakeAuthorTest(){
        // creating faker object
        Faker faker = new Faker();

        // creating fake book
        Book fakeBook = new Book(faker.book().title(), "12345NB", faker.number().numberBetween(100, 500));

        // Creating fake author
        Author fakeAuthor = new Author(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100),
              faker.book().genre());
        // Setting author to fakeBook
        fakeBook.setAuthor(fakeAuthor);
        // Setting fakeBook to fakeAuthor
        fakeAuthor.setBook(fakeBook);

        // testing not null;
        assertEquals(fakeAuthor.getBook(), fakeBook);
    }
}
