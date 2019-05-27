package com.codecool.car_race;


import com.codecool.car_race.vehicles.Car;
import com.codecool.car_race.vehicles.Motorcycle;
import com.codecool.car_race.vehicles.Truck;

import java.util.ArrayList;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        ArrayList<Car> cars = new ArrayList<>(10);
        ArrayList<Truck> trucks = new ArrayList<>(10);
        ArrayList<Motorcycle> motorcycles = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            cars.add(new Car());
        }
        for (int i = 0; i < 10; i++) {
            trucks.add(new Truck());
        }
        for (int i = 0; i < 10; i++) {
            motorcycles.add(new Motorcycle());
        }

        race.addVehicles(cars);
        race.addVehicles(trucks);
        race.addVehicles(motorcycles);

    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);

        race.simulateRace();
        race.printRaceResults();
    }
}
