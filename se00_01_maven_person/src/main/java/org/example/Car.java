package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private int seats;
    private int doors;
    private String color;

    private int passengers;

    public Car(int seats, int doors, String color) {
        this.seats = seats;
        this.doors = doors;
        this.color = color;
        this.passengers = 0;
    }

    public void getInTheCar() {
        if (passengers < seats) {
            this.passengers++;
        }
    }

    public String startTheCar(){
        if (passengers == seats){
            return "Let's drive!";
        } else {
            return "The car must be full to start driving";
        }
    }
}
