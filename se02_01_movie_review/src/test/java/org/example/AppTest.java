package org.example;


import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
   @Test
    public void creatingMoviesAndReviewsTest(){
      // creating empty objects
       Faker faker = new Faker();
       Random random = new Random();
       Critic boyero = new Critic();
       Movie alien = new Movie();
       Review alienReview = new Review();
       ArrayList<Review> allAlienReviews = new ArrayList<>();

       // faking params
       String criticName= faker.twinPeaks().character();
       String textOfReview = faker.twinPeaks().quote();
       String movieName = faker.twinPeaks().location();
       int rating = random.nextInt(1, 5);

       //setting critic params
       boyero.setCriticName(criticName);
       boyero.setReview(alienReview);

       //setting review params
       alienReview.setCritic(boyero);
       alienReview.setComment(textOfReview);
       alienReview.setRating(rating);
       alienReview.setMovie(alien);

       //setting movie params
       allAlienReviews.add(alienReview);
       alien.setCritic(boyero);
       alien.setMovieName(movieName);
       alien.setReviews(allAlienReviews);

       // testing equals and not equals.
       assertEquals(movieName, alien.getMovieName());
       assertNotEquals("Gladiator", alien.getMovieName());
       System.out.println(textOfReview);

       assertEquals(textOfReview, alien.getReviews().get(0).getComment());
       assertNotEquals("text", alien.getReviews().get(0).getComment());
   }
}
