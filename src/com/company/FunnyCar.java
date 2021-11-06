package com.company;

public class FunnyCar extends Car {

    public FunnyCar(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public Double getCleaningPrice() {
        return 30.0;
    }

    @Override
    public void changeWheels() {
        System.out.println("some wheels are changed");
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
