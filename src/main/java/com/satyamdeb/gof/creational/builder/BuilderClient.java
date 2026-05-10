package com.satyamdeb.gof.creational.builder;

public class BuilderClient {
    public static void main(String[] args) {

        Burger burger = new Burger.BurgerBuilder("Wheat", "Aloo").build();
        System.out.println(burger);

        Burger burgerWithCheese = new Burger.BurgerBuilder("Wheat", "Aloo")
                .withCheese(true)
                .build();
        System.out.println(burgerWithCheese);
        Burger burgerWithCheeseAndSauce = new Burger.BurgerBuilder("Wheat", "Aloo")
                .withCheese(true)
                .withSauce(true)
                .build();
        System.out.println(burgerWithCheeseAndSauce);
    }
}
