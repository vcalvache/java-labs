package org.example;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MovieTests {

    @Test
    public void createMovieObjectTest(){
        // Manually creating a movie object.
        Movie alien = new Movie("Alien");
        Faker faker = new Faker();
        String name = faker.twinPeaks().character();
        // assertEquals and assertNotEquals testing
        assertEquals("Alien", alien.getMovieName());
        assertNotEquals("Alien", name);

    }
}
