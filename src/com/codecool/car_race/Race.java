package com.codecool.car_race;

import java.util.ArrayList;

public class Race {

    private ArrayList<Object> racingVehicles = new ArrayList<>(30);

    void addVehicles(ArrayList list) {

        racingVehicles.addAll(list);

    }

    void simulateRace() {
        System.out.println("Race simulateRace");
    }



    void printRaceResults() {
        System.out.println("Race printRaceResults");
    }
}
