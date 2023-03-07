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
        Book book = new Book("It", "12345NB", 328);
        author.setBook(book);
        book.setAuthor(author);
        // Testing all parameters and not null
        assertEquals(firstName, author.getFirstName());
        assertEquals(lastName, author.getLastName());
        assertEquals(age, author.getAge());
        assertEquals(genre, author.getGenre());
        assertEquals(book, author.getBook());

    }
    @Test
    public void createFakeAuthorTest(){
        // creating fake object
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

    @Test
    public void authorWritesNewBookTest(){

        Faker faker = new Faker();

        // creating fake author
        Author fakeAuthor = new Author(faker.name().firstName(), faker.name().lastName(), faker.number().randomDigit(),
                faker.book().genre());

        // obtaining values to compare
        String bookTitle = faker.book().title();
        String ISBN = faker.idNumber().toString();
        int pages = faker.number().randomDigit();

        // create book with obtained values
        Book book = new Book(bookTitle, ISBN, pages);
        // creates a second book to compare
        Book newBookByAuthor = fakeAuthor.authorWritesNewBook(bookTitle, ISBN, pages);
        //assert equals of both books
        assertEquals(book.getTitle(), newBookByAuthor.getTitle());
        assertEquals(book.getISBN(), newBookByAuthor.getISBN());
        assertEquals(book.getPages(), newBookByAuthor.getPages());
    }

    @Test
    public void getOneBookTest(){

        Faker faker = new Faker();

        Author fakeAuthor = new Author(faker.name().firstName(), faker.name().lastName(), faker.number().randomDigit(),
                faker.book().genre());

        // creating multiple books and adding to author list
        for (int i = 0; i < 10; i++){
             Book fakeBook = new Book(faker.book().title(), "12345NB", faker.number().numberBetween(100, 500));
             fakeAuthor.addBooksToList(fakeBook);
        }
        // selecting a book from the author list
        Book toFind= fakeAuthor.getBookList().get(5);

        // asserting values
        assertEquals(toFind, fakeAuthor.getOneBook(toFind.getTitle()));
    }
}
