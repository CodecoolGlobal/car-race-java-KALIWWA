package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.Util;

public class Car extends Vehicle {


    public Car() {
        setName();
    }

    private void setName() {
        String[] nameParts = new String[]{"Elysium", "Corsair", "Empire", "Olympian", "Virtue",
                                            "Fang", "Voyage", "Supremacy", "Evolution", "Empyrean"};
        int firstPartIndex = Util.getRandomNumber(10);
        int secondPartIndex = Util.getRandomNumber(10);

        if (firstPartIndex == secondPartIndex) {
            secondPartIndex = Util.getRandomNumber(10);
            name = nameParts[firstPartIndex] + " " + nameParts[secondPartIndex];
        } else {
            name = nameParts[firstPartIndex] + " " + nameParts[secondPartIndex];
        }
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
