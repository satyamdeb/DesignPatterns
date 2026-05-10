package com.satyamdeb.gof.creational.factory;

public class FactoryClient {
    public static void main(String[] args) {
        LogisticsService service = new LogisticsService();
        service.send("Air");
        service.send("Road");
        service.send(null);
    }
}
