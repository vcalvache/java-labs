import com.github.javafaker.Faker;
import org.example.MyDate;
import org.example.Person;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void createPersonTest(){
        Faker faker = new Faker();
        MyDate birthDay = new MyDate(faker.number().numberBetween(1, 31), faker.number().numberBetween(1, 12),
        faker.number().numberBetween(1940,2023));
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        int age = faker.number().numberBetween(0, 120);
        int height = faker.number().randomDigit();
        int weight = faker.number().randomDigit();
        Person fakePerson = new Person(firstName, lastName, age, height, weight, birthDay);
        assertNotNull(fakePerson);
        assertEquals(firstName, fakePerson.getFirstName());
        assertEquals(birthDay, fakePerson.getBirthdayDate());
        assertEquals(birthDay.getYear(), fakePerson.getBirthdayDate().getYear());
    }
}
