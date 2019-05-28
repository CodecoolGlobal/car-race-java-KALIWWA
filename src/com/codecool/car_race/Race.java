package com.codecool.car_race;

import com.codecool.car_race.vehicles.Truck;
import com.codecool.car_race.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Race {
    private List<Vehicle> racingVehicles;
    private Weather weather;

    public Race() {
        this.racingVehicles = new ArrayList<>();
        this.weather = new Weather();
    }

    public boolean isRaining() {
        return weather.isRaining();
    }

    void addVehicle(Vehicle vehicle) {

        racingVehicles.add(vehicle);

    }

    public boolean isThereABrokenTruck() {
        for (Vehicle vehicle: racingVehicles) {
            if (vehicle instanceof Truck) {
                if (((Truck) vehicle).isBroken()) {
                    return true;
                }
            }
        }
        return false;
    }

    void simulateRace() {
        for (int i = 0; i < 50; i++) {
            weather.setRaining();
            for (Vehicle vehicle: racingVehicles) {
                vehicle.prepareForLap(this);
                vehicle.moveForAnHour();
            }
        }
    }



    void printRaceResults() {
        for (Vehicle vehicle: racingVehicles) {
            System.out.println(vehicle.getName() + " Travelled: " + vehicle.getDistanceTraveled());
        }
    }
}
