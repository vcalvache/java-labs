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
        return new Person(firstName, lastName);
    }

    public Person witLastName(String lastName){
        return new Person(firstName, lastName);
    }

    public void becomeOlder(){
        this.age += 5;
        if (this.age >= 138){
            this.isVampire = true;
        }
    }

    public String askIfVampire(){
        if (this.isVampire == true){
            return "This person is a vampire!";
        } else {
            return "This is not a vampire";
        }
    }

    public void killVampire(){
        if (this.isVampire == true){
            this.age = 0;
        }
    }
}
