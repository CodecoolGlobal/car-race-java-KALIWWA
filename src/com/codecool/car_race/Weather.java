package com.codecool.car_race;

public class Weather {

    private boolean raining;

    public Weather() {
        this.raining = true;
    }

    public void setRaining() {
        int raining = Util.getRandomNumber(10);
        this.raining = raining < 3;
    }

    public boolean isRaining() {
        return raining;
    }
}
