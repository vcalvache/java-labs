package org.example;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonClassTest {

    @Test
    public void createPersonTest(){
        // manually creating parameters
        String firstName = "Dale";
        String lastName = "Cooper";
        int age = 69;

        // creating and empty object and setting parameters
        Person agentCooper = new Person();
        agentCooper.setFirstName(firstName);
        agentCooper.setLastName(lastName);
        agentCooper.setAge(age);

        // Testing all parameters and not null
        assertEquals(firstName, agentCooper.getFirstName());
        assertEquals(lastName, agentCooper.getLastName());
        assertEquals(age, agentCooper.getAge());
        assertNotNull(agentCooper);

    }
    @Test
    public void createFakePersonTest(){
        // creating faker object
        Faker fakeDataGenerator = new Faker();

        // Creating a new person object and passing all parameters
        Person fakePersonTest = new Person(fakeDataGenerator.name().firstName(), fakeDataGenerator.name().lastName(),
                fakeDataGenerator.number().numberBetween(0, 100), false);

        // testing not null;
        assertNotNull(fakePersonTest);
    }
}
