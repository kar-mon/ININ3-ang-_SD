package com.company;

public class PersonalCar extends Car {

    Boolean autonomous = false;

    public PersonalCar(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public Double getCleaningPrice() {
        return 40.0;
    }

    @Override
    public void changeWheels() {
        System.out.println("4 wheels changed");
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
