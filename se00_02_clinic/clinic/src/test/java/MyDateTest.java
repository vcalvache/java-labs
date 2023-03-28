import com.github.javafaker.Faker;
import org.example.MyDate;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyDateTest {

    @Test
    public void createMyDateTest(){
        Faker faker = new Faker();
        int day = faker.number().numberBetween(1, 31);
        int month = faker.number().numberBetween(1, 12);
        int year = faker.number().numberBetween(1900, 2023);

        MyDate fakeDate = new MyDate();
        fakeDate.setDay(day);
        fakeDate.setMonth(month);
        fakeDate.setYear(year);
        assertEquals(day, fakeDate.getDay());
        assertEquals(month, fakeDate.getMonth());
        assertEquals(year, fakeDate.getYear());
    }
}
