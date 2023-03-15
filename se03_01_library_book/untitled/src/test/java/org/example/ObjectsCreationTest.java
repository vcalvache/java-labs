package org.example;


import com.github.javafaker.Faker;
import org.example.model.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObjectsCreationTest {

    @Test
    public void createPersonTest() {
        Faker faker = new Faker();
        Person fakePerson = new Person(faker.name().firstName(), faker.name().lastName());
        assertNotNull(fakePerson);
        System.out.println(fakePerson.toString());
    }

    @Test
    public void createMemberTest(){
        Faker faker = new Faker();
        Member fakeMember = new Member(faker.name().firstName(), faker.name().lastName(), "fakeemail@email.com",
                faker.name().username(), "password1234");
        assertNotNull(fakeMember);
        Member newFakeMember = new Member(faker.name().firstName(), faker.name().lastName(), "fakeemail@email.com",
                faker.name().username(), "password1234");

        System.out.println(fakeMember.toString());

    }

    @Test
    public void createUserTest(){
        Faker faker = new Faker();
        User fakeUser = new User(faker.name().firstName(), faker.name().lastName(), "fakeemail@email.com",
                faker.name().username(), "password1234");
        assertNotNull(fakeUser);
        User newFakeUser = new User(faker.name().firstName(), faker.name().lastName(), "newfakeemail@email.com",
                faker.name().username(), "newpassword1234");
        assertNotEquals(fakeUser, newFakeUser);
        assertNotEquals(fakeUser.getUserID(), newFakeUser.getUserID());
        System.out.println(fakeUser.toString());
    }

    @Test
    public void createLibrarianTest(){
        Faker faker = new Faker();
        Librarian fakeLibrarian = new Librarian(faker.name().firstName(), faker.name().lastName(), "fakeemail@email.com",
                faker.name().username(), "password1234");
        assertNotNull(fakeLibrarian);
        Librarian newFakeLibrarian = new Librarian(faker.name().firstName(), faker.name().lastName(), "newfakeemail@email.com",
                faker.name().username(), "newpassword1234");
        assertNotNull(newFakeLibrarian);
        assertNotEquals(fakeLibrarian.getLibrarianID(), newFakeLibrarian.getLibrarianID());
        System.out.println(fakeLibrarian.toString());
        System.out.println(newFakeLibrarian.toString());
    }

    @Test
    public void createAuthorTest(){
        Faker faker = new Faker();
        Book fakeBook = new Book(faker.book().title(), faker.book().author(), faker.number().numberBetween(1526, 2023), "12345ISBN");

        Author fakeAuthor = new Author(faker.name().firstName(), faker.name().lastName());
        fakeAuthor.getBooks().add(fakeBook);
        assertEquals(fakeBook, fakeAuthor.getBooks().get(0));
        System.out.println(fakeAuthor.toString());
    }

    @Test
    public void createPublicationTest(){
        Faker faker = new Faker();
        Publication fakePublication = new Publication(faker.book().title(), faker.book().author(), faker.number().numberBetween(1900, 2023));
        assertNotNull(fakePublication);
        System.out.println(fakePublication.toString());
    }

    @Test
    public void createBookTest(){
        Faker faker = new Faker();
        Book fakeBook = new Book(faker.book().title(), faker.book().author(), faker.number().numberBetween(1526, 2023), "12345ISBN");
        Book newFakeBook = new Book(faker.book().title(), faker.book().author(), faker.number().numberBetween(1526, 2023), "12345ISBN");
        String fakeBookTitle = fakeBook.getTitle();
        assertNotNull(fakeBook);
        assertEquals(fakeBookTitle, fakeBook.getTitle());
        assertNotEquals(fakeBook.getPublicationID(), newFakeBook.getPublicationID());
        System.out.println(fakeBook.toString());
    }

    @Test
    public void createMultimediaTest(){
        Faker faker = new Faker();
        Multimedia fakeMultimedia = new Multimedia(faker.book().title(), faker.book().author(), faker.number().numberBetween(1526, 2023), "DVD");
        assertNotNull(fakeMultimedia);
        System.out.println(fakeMultimedia.toString());
    }
}


