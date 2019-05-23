package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;

public abstract class Vehicle {
    int distanceTraveled;
    String name;



    // setup the actual speed used for the current lap
    public abstract void prepareForLap(Race race);

    // The vehicle travels for an hour. It increases the distance traveled. Call this from the Race::simulateRace() only!
    public abstract void moveForAnHour();
}
