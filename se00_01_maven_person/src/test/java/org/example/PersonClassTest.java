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

    @Test
    public void becomeOlderTest(){
        Faker fake = new Faker();

        // create fake person
        Person fakePerson = new Person(fake.name().firstName(), fake.name().lastName(),
                fake.number().numberBetween(1, 15));

        // stores initial age
        int originalAge = fakePerson.getAge();
        // asserts initial age
        assertEquals(originalAge, fakePerson.getAge());
        // ages person
        fakePerson.becomeOlder();
        fakePerson.becomeOlder();
        fakePerson.becomeOlder();
        // stores new age value
        int newAge = originalAge + (5 * 3);
        // compares ages
        assertEquals(newAge, fakePerson.getAge());
    }

    @Test
    public void withFirstNameTest(){

        Faker faker = new Faker();
        // initialize firstName value
        String firstName= faker.name().firstName();
        // creates person
        Person person = new Person();
        // set  person with initialized firstName
        person = person.withFirstName(firstName);
        // compares values
        assertEquals(firstName, person.getFirstName());
    }

    @Test
    public void withLastNameTest(){
        Faker faker = new Faker();

        String lastName = faker.name().lastName();

        Person person = new Person();
        // set  person with initialized lastName
        person = person.witLastName(lastName);
        assertEquals(lastName, person.getLastName());
    }

    @Test
    public void askIfVampireTest(){
        Faker fake = new Faker();

        Person fakeVampire = new Person(fake.name().firstName(), fake.name().lastName(),
                fake.number().numberBetween(150, 200));
        // ages the person until becomes vampire
        fakeVampire.becomeOlder();
        //compares if is vampire
        assertEquals("This person is a vampire!", fakeVampire.askIfVampire());
    }

    @Test
    public void killVampireTest(){
        Faker fake = new Faker();

        Person fakeVampire = new Person(fake.name().firstName(), fake.name().lastName(),
                fake.number().numberBetween(150, 200));
        //ages until becomes vampire
        fakeVampire.becomeOlder();
        // kills vampire
        fakeVampire.killVampire();
        // checks if vampire is dead
        assertEquals(0, fakeVampire.getAge());
    }
}
