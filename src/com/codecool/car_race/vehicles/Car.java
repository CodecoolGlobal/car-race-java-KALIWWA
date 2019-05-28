package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.Util;

public class Car extends Vehicle {


    public Car(String name) {
        super(name);
    }




    @Override
    public void prepareForLap(Race race) {
        if (race.isThereABrokenTruck()) {
            int maxSpeed = 75;
            speed = Util.getRandomNumber(maxSpeed);
        } else {
            int maxSpeed = 110;
            int minSpeed = 80;
            speed = Util.getRandomNumber(minSpeed, maxSpeed);

        }

    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }


}
