package com.codecool.car_race;

import java.util.Random;

public final class Util {
    private static Random random = new Random();

    public static int getRandomNumber(int bound) {
        return random.nextInt(bound);
    }

    public static int getRandomNumber(int min, int max) {
        return random.nextInt((max - min + 1) + min);
    }
}

