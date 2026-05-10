package com.satyamdeb.gof.creational.builder;

public class Burger {
    private final String bun;
    private final String patty;
    private final boolean hasCheese;
    private final boolean hasSauce;

    private Burger(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.hasCheese =builder.hasCheese;
        this.hasSauce = builder.hasSauce;
    }

    public static class BurgerBuilder {

        // Required
        private final String bun;
        private final String patty;

        // Optional
        private boolean hasCheese;
        private boolean hasSauce;

        public BurgerBuilder(String bun, String patty) {
            this.bun = bun;
            this.patty = patty;
        }

        public BurgerBuilder withCheese(boolean hasCheese) {
            this.hasCheese = hasCheese;
            return this;
        }

        public BurgerBuilder withSauce(boolean hasSauce) {
            this.hasSauce = hasSauce;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }

    @Override
    public String toString() {
        return "Burger{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", hasCheese=" + hasCheese +
                ", hasSauce=" + hasSauce +
                '}';
    }
}
