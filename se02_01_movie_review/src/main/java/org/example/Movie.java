package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    // first approach for Movie class
    private String movieName;
    private ArrayList<Review> reviews;
    private Critic critic;

    public Movie(String movieName){
        this.movieName = movieName;
    }
}
