package org.example;


import com.github.javafaker.Faker;
import org.example.model.Librarian;
import org.example.model.Member;
import org.example.model.Person;
import org.example.model.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObjectsCreationTest {

    @Test
    public void createPersonTest() {
        Faker faker = new Faker();
        Person fakePerson = new Person(faker.name().firstName(), faker.name().lastName());
        assertNotNull(fakePerson);
    }

    @Test
    public void createMemberTest(){
        Faker faker = new Faker();
        Member fakeMember = new Member(faker.name().firstName(), faker.name().lastName(), "fakeemail@email.com",
                faker.name().username(), "password1234");
        assertNotNull(fakeMember);
        Member newFakeMember = new Member(faker.name().firstName(), faker.name().lastName(), "fakeemail@email.com",
                faker.name().username(), "password1234");

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
    }
}


