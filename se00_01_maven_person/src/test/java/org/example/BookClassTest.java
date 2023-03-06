package org.example;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class BookClassTest {

    @Test
    public void createBookTest(){
        // manually creating values
        String title = "It";
        String ISBN = "12345NB";
        int pages = 386;
        Author stephenKing = new Author("Stehpen", "King", 76, "Horror");

        // creating and empty object and setting parameters for Book
        Book it = new Book();

        // setting values
        it.setTitle(title);
        it.setISBN(ISBN);
        it.setPages(pages);
        it.setAuthor(stephenKing);

        // Testing all parameters and not null
        assertEquals(title, it.getTitle());
        assertEquals(ISBN, it.getISBN());
        assertEquals(pages, it.getPages());
        assertEquals(stephenKing, it.getAuthor());
        assertNotNull(it);
    }

    @Test
    public void createFakeBookTest(){
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
