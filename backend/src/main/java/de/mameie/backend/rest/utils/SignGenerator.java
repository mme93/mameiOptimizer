package de.mameie.backend.rest.utils;

import java.util.Random;

public class SignGenerator {
    public static String getSign(){
        Random rnd = new Random();
        int number = rnd.nextInt(999999999);
        return String.format("%09d", number);
    }
}
