package com.company;

public class Bus extends Car {
    Integer capacityInPeople;

    public Bus(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public String toString() {
        return "I'm the bus and i can have " + capacityInPeople + " inside";
    }

    @Override
    public Double getCleaningPrice() {
        return 100.0;
    }

    @Override
    public void changeWheels() {
        System.out.println("6 wheels changed");
    }


    @Override
    public Double getPrice() {
        return null;
    }

    @Override
    public Human getOwner() {
        return null;
    }

    @Override
    public void sell(Human buyer) throws Exception {

    }
}
