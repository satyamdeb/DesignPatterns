package com.satyamdeb.gof.creational.factory;

import java.util.Objects;

public class LogisticsFactory {

    public static Logistics getLogistics(String mode) {
        if(Objects.equals(mode, "Road")) return new Road();
        else return new Air();
    }

}
