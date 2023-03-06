package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Critic {
    //first approach of critic class
    private String criticName;
    private Review review;

    public Critic(String criticName){
        this.criticName = criticName;
    }
}
