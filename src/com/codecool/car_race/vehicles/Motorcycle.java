package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.Util;

public class Motorcycle extends Vehicle {

    private static int motorcycleNumber = 0;

    public Motorcycle() {
        setName();

    }

    private void setName() {
        motorcycleNumber++;
        name = "Motorcycle " + motorcycleNumber;
    }

    @Override
    public void prepareForLap(Race race) {
        if (race.isRaining()) {
            int decreaseSpeedValue = Util.getRandomNumber(5, 50);
            speed -= decreaseSpeedValue;
        } else {
            speed = 100;
        }
    }

}
