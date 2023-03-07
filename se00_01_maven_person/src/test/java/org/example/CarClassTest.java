package org.example;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarClassTest {

    @Test
    public void createCarTest(){
        // manually creating parameters
        int seats = 5;
        int doors = 3;
        String color = "Black";

        // creating and empty object and setting parameters
        Car fiat500 = new Car();

        fiat500.setSeats(seats);
        fiat500.setDoors(doors);
        fiat500.setColor(color);

        // Testing all parameters and not null
        assertEquals(seats, fiat500.getSeats());
        assertEquals(doors, fiat500.getDoors());
        assertEquals(color, fiat500.getColor());
        assertNotNull(fiat500);
    }
    @Test
    public void createFakeCarTest(){
        // creating faker object
        Faker fakeDataGenerator = new Faker();

        // Creating a new person object and passing all parameters
        Car fakeCar = new Car(fakeDataGenerator.number().numberBetween(1, 8), fakeDataGenerator.number().numberBetween(1, 5),
                fakeDataGenerator.color().name());

        // testing not null;
        assertNotNull(fakeCar);
    }

    @Test
    public void getInTheCarTest() {

        // Creating a new person object and passing all parameters
        Car fakeCar = new Car(4, 3, "Red");

        // checks value every getInCar() call
        assertEquals(0, fakeCar.getPassengers());
        fakeCar.getInTheCar();
        assertEquals(1, fakeCar.getPassengers());
        fakeCar.getInTheCar();
        assertEquals(2, fakeCar.getPassengers());
        fakeCar.getInTheCar();
        assertEquals(3, fakeCar.getPassengers());
        fakeCar.getInTheCar();
        assertEquals(4, fakeCar.getPassengers());
        fakeCar.getInTheCar();
        // checks if has added more than the available seats
        assertNotEquals(5, fakeCar.getPassengers());

    }

    @Test
    public void startTheCarTest(){
        Car fakeCar = new Car(4, 3, "Red");

        // enters people until car is full
        for (int i = 0; i < fakeCar.getSeats(); i++){
            fakeCar.getInTheCar();
        }

        // stores value with car ready
        String isTheCarReady = fakeCar.startTheCar();
        // asserts if car is ready or not
        assertEquals(isTheCarReady, fakeCar.startTheCar());
    }
}
