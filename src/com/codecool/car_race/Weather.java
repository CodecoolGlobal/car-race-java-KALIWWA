package com.codecool.car_race;

import java.util.Random;

public class Weather {

    private Random random = new Random();

    private int setRaining() {
        return random.nextInt(10);
    }

    public boolean isRaining() {
        int raining = setRaining();
        if (0 < raining && raining < 3) {
            return true;
        } else {
            return false;
        }
    }
}
