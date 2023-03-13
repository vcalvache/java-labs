package org.example;


import com.github.javafaker.Faker;
import org.example.model.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

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

    }
}


