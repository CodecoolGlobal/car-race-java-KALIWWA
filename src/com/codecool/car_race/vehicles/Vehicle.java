package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public abstract class Vehicle {
    protected int distanceTraveled;
    protected String name;
    protected int speed;

    public Vehicle(String name) {
        this.distanceTraveled = 0;
        this.name = name;
        this.speed = 0;
    }

    public String getName() {
        return name;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    // setup the actual speed used for the current lap
    public abstract void prepareForLap(Race race);

    // The vehicle travels for an hour. It increases the distance traveled. Call this from the Race::simulateRace() only!
    public void moveForAnHour() {
        distanceTraveled += speed;
    }
}
