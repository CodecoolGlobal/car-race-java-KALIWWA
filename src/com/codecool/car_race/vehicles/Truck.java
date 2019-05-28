package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.Util;

public class Truck extends Vehicle {

    private int breakdownTurnsLeft;

    public Truck() {
        super(String.valueOf(Util.getRandomNumber(1000)));
        breakdownTurnsLeft = 0;
    }


    public boolean isBroken() {
        return breakdownTurnsLeft > 0;
    }

    @Override
    public void prepareForLap(Race race) {
        if (isBroken()) {
            breakdownTurnsLeft --;

        } else {
            boolean isBreaking = Util.getRandomNumber(20) == 5;
            if (isBreaking) {
                speed = 0;
                breakdownTurnsLeft = 2;
            } else {
                speed = 100;
            }
        }
    }

}
