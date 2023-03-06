package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentNoComposition extends Person{
    private String university;

    public StudentNoComposition(String firstName, String lastName, int age, String university){
        super(firstName, lastName, age, false);
        this.university = university;
    }
}
