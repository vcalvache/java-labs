package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    private boolean isVampire = false;

    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person (String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person withFirstName(String firstName){
        // return new Person only with firstName
        return new Person(firstName, lastName);
    }

    public Person witLastName(String lastName){
        // return new Person only with lastName
        return new Person(firstName, lastName);
    }

    public void becomeOlder(){
        // increments the abe by 5 and turns into vampire if age is 138 or more
        this.age += 5;
        if (this.age >= 138){
            this.isVampire = true;
        }
    }

    public String askIfVampire(){
        // checks if is a vampire
        if (this.isVampire){
            return "This person is a vampire!";
        } else {
            return "This is not a vampire";
        }
    }

    public void killVampire(){
        // if vampire kills vampire.
        if (this.isVampire){
            this.age = 0;
        }
    }
}
