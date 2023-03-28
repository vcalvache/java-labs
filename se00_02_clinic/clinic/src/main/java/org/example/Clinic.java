package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Clinic {
    private double lowestWeightIndex;
    private String name;
    private ArrayList<Person> members;

    public Clinic (String name, double lowestWeightIndex){
        this.name = name;
        this.lowestWeightIndex = lowestWeightIndex;
        this.members = new ArrayList<>();
    }

    public boolean isAccepted(Person person){
        if (person.getWeight() < lowestWeightIndex){
            return true;
        }
        return false;
    }

    public void addAsMember(Person person){
        if (isAccepted(person) == true){
            members.add(person);
        }
    }

    public Person personWithHighestWeightIndex(){
        Person heaviestPerson = new Person();
        double heaviestWeight = 0;
        for (Person person: members){
            if(person.getWeight() > heaviestWeight){
                heaviestWeight = person.getWeight();
                heaviestPerson = person;
            }
        }
        return heaviestPerson;
    }
}
