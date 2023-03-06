package org.example;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class StudentNoCompositionClassTest {

    @Test
    public void createStudentTest(){
        String firstName = "Victor";
        String lastName = "Calvache";
        int age = 37;
        String university = "CIFO La Violeta";

        Car fiat500 = new Car(5, 3, "Black");
        Book javaProgramming  = new Book("Java Programming", "12345NB", 378);
        ArrayList<Book> books = new ArrayList<>();
        books.add(javaProgramming);

        StudentNoComposition newStudent = new StudentNoComposition();

        newStudent.setFirstName(firstName);
        newStudent.setLastName(lastName);
        newStudent.setAge(age);
        newStudent.setUniversity(university);


        assertNotNull(newStudent);
        assertEquals(firstName, newStudent.getFirstName());
        assertEquals(lastName, newStudent.getLastName());
        assertEquals(age, newStudent.getAge());
        assertEquals(university, newStudent.getUniversity());

    }

    @Test
    public void createFakeStudentTest(){
        Faker faker = new Faker();

        StudentNoComposition fakeStudent = new StudentNoComposition(faker.name().firstName(), faker.name().lastName(), faker.number().numberBetween(1, 100), faker.university().name());
        assertNotNull(fakeStudent);
        System.out.println(fakeStudent.toString());
        System.out.println(fakeStudent.getFirstName());
    }
}
