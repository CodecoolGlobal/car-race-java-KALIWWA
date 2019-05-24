package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

import java.util.Random;

public class Car extends Vehicle {

    private int normalSpeed;

    public Car() {
        prepareForLap();
    }

    @Override
    public void prepareForLap() {
        Random random = new Random();
        int minSpeed = 80;
        int maxSpeed = 110;
        normalSpeed = random.nextInt((maxSpeed - minSpeed) + 1) + minSpeed;
        setNormalSpeed(normalSpeed);
    }

    @Override
    public void moveForAnHour() {
        assert true;
    }

    private int getNormalSpeed() {
        return normalSpeed;
    }

    private void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }
}
