package org.example;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ReviewTest {

    @Test
    public void createReviewObjectTest(){
        // first test. Creating a review and set comment manually.
        Movie alien = new Movie("Alien");
        Critic victor = new Critic("Victor");
        Review alienReview = new Review(alien, victor, 5, "Must see");

        assertNotEquals("Predator", alienReview.getMovie().getMovieName());
        assertEquals("Must see", alienReview.getComment());
    }
}
